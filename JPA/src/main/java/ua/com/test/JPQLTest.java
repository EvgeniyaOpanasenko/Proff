package ua.com.test;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

import static ua.com.utils.Factory.getEntityManagerFactory;

/**
 * Created by EVA on 01.04.2017.
 */
public class JPQLTest {
    public static void main(String[] args) {
        EntityManager manager = getEntityManagerFactory();

        //java persistence query language, hql, sql + oop
        Query query = manager.createQuery("SELECT c FROM Candidate c WHERE c.name LIKE :inName");
        //Query query = manager.createQuery("SELECT c FROM Candidate c");

        List list = query.setParameter("inName", "masha").
                setFirstResult(1).setMaxResults(3).getResultList();

      /*  List list = query.
                setFirstResult(1).setMaxResults(10).getResultList();
*/

        list.stream().forEach(System.out::println);

        manager.close();

        //manager.createQuery("INSERT INTO candidate (age,name) VALUES(12, 'igor')");
    }
}
