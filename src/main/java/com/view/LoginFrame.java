package com.view;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginFrame extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//        String st = req.getParameter("encoding");
//        res.setContentType("text/html; charset=utf-8");
//        res.setCharacterEncoding("utf-8");

//        pw.println("<h1>用户名</h1>");
//        pw.println("<form action = ''  method = 'post'>");
//        pw.println("用户名 : <input type = 'text' name = 'username'/></br>");
//        pw.println("密码 : <input type = 'password' name = 'password'/></br>");
//        pw.println("<input type = 'submit' value = '登录'/>");
//        pw.println("</form>");


        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        pw.println("<h1>User Login</h1>");
        pw.println("<form action = 'loginservlet'  method = 'post'>");
        pw.println("Username : <input type = 'text' name = 'username'/></br>");
        pw.println("Password : <input type = 'password' name = 'password'/></br>");
        pw.println("<input type = 'submit' value = 'login'/>");
        pw.println("</form>");

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        this.doPost(req, res);

    }
}
