package ua.com.servlet;

import ua.com.exceptions.NoEntityFoundException;
import ua.com.model.Candidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends MyServltet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        try {
            Candidate found = service.login(name);
            HttpSession session = req.getSession(true);

            session.setAttribute("inSystem", true);
            session.setAttribute("currentUserName", found.getName());

            resp.sendRedirect("index.jsp");
        } catch (NoEntityFoundException e) {

            req.setAttribute("errortitle", "Login error");
            req.setAttribute("errorMessage", "Invalid name");

            req.getRequestDispatcher("/WEB-INF/pages/error.jsp");
        }


    }
}
