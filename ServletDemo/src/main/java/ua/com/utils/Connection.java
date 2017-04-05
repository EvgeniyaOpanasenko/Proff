package ua.com.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Lisa on 3/5/2017.
 */
public class Connection {

    private static final EntityManagerFactory INSTANCE = Persistence.createEntityManagerFactory(
            "myunit");

    public static EntityManagerFactory getConnection () {
        return INSTANCE;
    }
}
