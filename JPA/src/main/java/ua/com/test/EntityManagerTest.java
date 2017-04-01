package ua.com.test;


import ua.com.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EntityManagerTest {

    public static final String PERSISTENCE_UNIT_NAME = "jpaunit";

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("jpaunit");

        EntityManager manager = factory.createEntityManager();

        Candidate candidate = new Candidate("masha", 15,
                new Clan("clan125"),
                new Hobby(HobbyType.THEATRE),
                new Region(RegionName.LVOV, 24));

        EntityTransaction transaction = manager.getTransaction();
        try {
            transaction.begin();
            manager.persist(candidate);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
            factory.close();

        }

    }
}
