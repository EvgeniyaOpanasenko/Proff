package ua.com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.service.MainService;

public class Run {
    public static void main(String[] args) throws NoEntityFoundException, NoAvaliableTableException {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");

        MainService mainService = applicationContext.getBean(MainService.class);
        Candidate candidate = new Candidate("ivan", 78, new Clan("Partiya2"),
                new Region(RegionName.KHARKOV), new Hobby((HobbyType.SPORT)));

        mainService.createCandidate(candidate);

        System.out.println(mainService.findCandidate(Long.valueOf(7)));


    }
}
