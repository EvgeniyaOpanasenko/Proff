package ua.com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.Fixtures.MainService;
import ua.com.soap.CandidateEndpointImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by EVA on 07.04.2017.
 */
public class RunSoapServer {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");

        MainService service = applicationContext.getBean(MainService.class);
        Endpoint.publish("http://localhost:9999/soap/eva", new CandidateEndpointImpl(service));

    }
}
