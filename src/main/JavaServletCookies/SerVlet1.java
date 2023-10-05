package main.JavaServletCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/Servlet1"})
public class SerVlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("xin chao trung tam java");
        Cookie cookie=new Cookie("name " ,"TRUNG TAM JAVA");
        cookie.setMaxAge(5);
        resp.addCookie(cookie);
        Cookie cookie1=new Cookie("age ","28");
        resp.addCookie(cookie1);
    }
}
