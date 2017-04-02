package ua.com.test;

import ua.com.model.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

import static ua.com.utils.Factory.getEntityManagerFactory;

/**
 * Created by EVA on 02.04.2017.
 */
public class TestFetchType {
    public static void main(String[] args) {
        EntityManager manager = getEntityManagerFactory();

        Candidate candidate = new Candidate("kostya", 12);

        Clan clan = new Clan();
        for (int i = 0; i < 100; i++) {
            clan.setName(String.valueOf(i));
        }

        Hobby hobby = new Hobby(HobbyType.SPORT);
        Region region = new Region(RegionName.KHARKOV);

        candidate.setClan(clan);
        candidate.setRegion(region);
        candidate.setHobby(hobby);

        manager.getTransaction().begin();
        manager.persist(clan);
        manager.getTransaction().commit();

        manager.clear();

        /*Query query = manager.createNamedQuery("getAllCandidates");
        List list = query.setFirstResult(1).setMaxResults(20).getResultList();
        list.stream().forEach(System.out::println);*/

        manager.close();
    }

}
