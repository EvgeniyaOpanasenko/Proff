package ua.com.test;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerTest {

    public static final String PERSISTENCE_UNIT_NAME = "jpaunit";

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("jpaunit");
    }
}
