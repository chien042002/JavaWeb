package main.JavaServletSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/hello-session"})
public class Session1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession  httpSession= req.getSession();
        httpSession.setAttribute("name" ,"hocjavaweb");
        httpSession.setAttribute("age",new Integer(28));
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("xin chao trung tam java - set session");
    }
}
