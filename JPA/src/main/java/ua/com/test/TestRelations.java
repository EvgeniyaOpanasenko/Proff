package ua.com.test;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import ua.com.model.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

import static ua.com.utils.Factory.getEntityManagerFactory;

/**
 * Created by EVA on 02.04.2017.
 */
public class TestRelations {

    public static final String All_CANDIDATES_QUERY =
            "SELECT c FROM Candidate c";

    public static void main(String[] args) {

        EntityManager manager = getEntityManagerFactory();

        Candidate candidate = new Candidate("kolya", 12);
        Clan clan = new Clan("clan23");
        Hobby hobby = new Hobby(HobbyType.SPORT);
        Region region = new Region(RegionName.KHARKOV);

        candidate.setClan(clan);
        candidate.setRegion(region);
        candidate.setHobby(hobby);

        manager.getTransaction().begin();
        manager.persist(candidate);
        manager.getTransaction().commit();

        Query query = manager.createNamedQuery("getAllCandidates");
        List list = query.setFirstResult(1).setMaxResults(20).getResultList();
        list.stream().forEach(System.out::println);

        manager.close();

    }
}
