package ua.com.servlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import ua.com.Fixtures.MainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Created by EVA on 06.04.2017.
 */
@WebServlet
public class MyServltet extends HttpServlet {
    protected static final Logger LOG = Logger.getLogger(RegisterCandidateServlet.class);

    private ApplicationContext applicationContext;
    protected MainServiceImpl service;

    @Override
    public void init() throws ServletException {
        applicationContext = (ApplicationContext) getServletContext().getAttribute("spring-context");
        service = applicationContext.getBean(MainServiceImpl.class);
    }
}
