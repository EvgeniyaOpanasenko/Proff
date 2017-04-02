package ua.com.test;

import ua.com.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static ua.com.utils.Factory.getEntityManagerFactory;

/**
 * Created by EVA on 01.04.2017.
 */
public class EntityLifecycleTest {
    public static void main(String[] args) {
        EntityManager manager = getEntityManagerFactory();

        Candidate candidate = new Candidate("masha", 15,
                new Clan("clan125"),
                new Hobby(HobbyType.THEATRE),
                new Region(RegionName.LVOV, 24));

        // delete

        manager.getTransaction().begin();
        long id = 3;
        Candidate deleteCandidate = manager.find(Candidate.class, id);
        manager.remove(deleteCandidate);
        manager.getTransaction().commit();

        manager.close();
    }


}
