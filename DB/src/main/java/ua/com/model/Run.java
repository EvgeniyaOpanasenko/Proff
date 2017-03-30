package ua.com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.dao.CandidateDao;
import ua.com.dao.CandidateDaoImpl;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.service.MainService;
import ua.com.service.MainServiceImpl;

public class Run {
    public static void main(String[] args) throws NoEntityFoundException, NoAvaliableTableException {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");

        MainService mainService = applicationContext.getBean(MainService.class);
        Candidate candidate = new Candidate("service", 78, new Clan("Lvov"),
                new Region(RegionName.KIEV), new Hobby((HobbyType.FINANCE)));

        mainService.createCandidate(candidate);

        mainService.findCandidate("ivan");

        //System.out.println(dao.getAll());


    }
}
