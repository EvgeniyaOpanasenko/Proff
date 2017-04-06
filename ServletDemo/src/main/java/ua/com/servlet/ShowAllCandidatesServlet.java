package ua.com.servlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Candidate;
import ua.com.service.MainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by EVA on 06.04.2017.
 */
@WebServlet(urlPatterns = "/showAll")
public class ShowAllCandidatesServlet extends HttpServlet {

    private static final Logger LOG = Logger.getLogger(RegisterCandidateServlet.class);

    private ApplicationContext applicationContext;
    private MainServiceImpl service;
    @Override
    public void init() throws ServletException {
        applicationContext = (ApplicationContext) getServletContext().getAttribute("spring-context");
        service = applicationContext.getBean(MainServiceImpl.class);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Candidate> candidateList = service.getAllCanidates();
        } catch (NoEntityFoundException e) {
            e.printStackTrace();
        } catch (NoAvaliableTableException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
