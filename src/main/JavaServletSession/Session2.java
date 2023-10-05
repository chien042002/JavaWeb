package main.JavaServletSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/session2"})
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        String name="";
        HttpSession httpSession=req.getSession();
        Object object= httpSession.getAttribute("name");
        if (object!=null){
            name=String.valueOf(object);
        }else {
            resp.sendRedirect("/HocJavaWeb/hello-session");
        }
       //int age= Integer.valueOf(String.valueOf( httpSession.getAttribute("age"));
        int age=(Integer) httpSession.getAttribute("age");
        printWriter.println("xin chao"+name+age);
    }
}
