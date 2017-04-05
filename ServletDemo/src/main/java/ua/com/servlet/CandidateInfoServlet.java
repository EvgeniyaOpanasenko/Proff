package ua.com.servlet;

import ua.com.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/info")
public class CandidateInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("candidate", new Candidate("eva", 12,
                new Clan("clanEva"),
                new Region(RegionName.KHARKOV),
                new Hobby(HobbyType.SPORT)));

        req.getRequestDispatcher("/WEB-INF/pages/candidate-info.jsp").forward(req, resp);
    }
}
