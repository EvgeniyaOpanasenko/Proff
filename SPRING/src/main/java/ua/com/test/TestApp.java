package ua.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by EVA on 03.04.2017.
 */
public class TestApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("app-context.xml");


        //String appname = context.getApplicationName();

    }
}
