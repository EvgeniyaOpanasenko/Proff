package ua.com.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by EVA on 01.04.2017.
 */
public class Factory {

    public static EntityManager getEntityManagerFactory() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("jpaunit");

        return factory.createEntityManager();
    }
}
