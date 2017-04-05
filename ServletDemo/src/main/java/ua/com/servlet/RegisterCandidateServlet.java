package ua.com.servlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import ua.com.exceptions.NoAvaliableTableException;
import ua.com.exceptions.RegisterException;
import ua.com.model.Candidate;
import ua.com.model.Clan;
import ua.com.model.Hobby;
import ua.com.model.Region;
import ua.com.service.MainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ua.com.converter.Converter.*;

@WebServlet(urlPatterns = {"/register"})
public class RegisterCandidateServlet extends HttpServlet {

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
        //redirect to register.jsp
        req.getRequestDispatcher("/WEB-INF/pages/register-candidate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // waiting data from the form

        String name = req.getParameter("name");
        String ageString = req.getParameter("age");
        int age = Integer.parseInt(ageString);
        String hobbyString = req.getParameter("hobby");
        Hobby hobby = convertToHobby(hobbyString);
        String clanString = req.getParameter("clan");
        Clan clan = convertToClan(clanString);
        String regionString = req.getParameter("region");
        Region region = covertToRegion(regionString);

        if (name == null || ageString == null || hobbyString == null ||
                clanString == null || regionString == null) {
            //resp.sendRedirect("/");
            resp.sendRedirect("/WEB-INF/pages/error.jsp");
        } else {
           Candidate candidate = new Candidate(name, age, clan, region, hobby);

            try {
                Candidate createCandidate = service.createCandidate(candidate);
                req.setAttribute("candidate", createCandidate);
                req.getRequestDispatcher("/WEB-INF/pages/candidate-info.jsp").forward(req, resp);
            } catch (RegisterException e) {
                LOG.error(e);
            } catch (NoAvaliableTableException e) {
                LOG.error(e);
            }
        }
    }
}
