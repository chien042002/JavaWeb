package main.Cookies.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<form action='/HocJavaWeb/login' method='post'>");
        printWriter.println("Username:<input type='text' name='username'>");
        printWriter.println("Password:<input type='password' name='password'>");
        printWriter.println("<input type='submit' value='login'>");
        printWriter.println("</form>");
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username= req.getParameter("username");
        String password= req.getParameter("username");
        if (username.equals("letatchien")&&password.equals("123456")){
            Cookie cookie=new Cookie("username",username);
            cookie.setMaxAge(30);
            resp.addCookie(cookie);
            resp.sendRedirect("/HocJavaWeb/welcome");

        }else {
            resp.sendRedirect("/HocJavaWeb/login");
        }
    }
}
