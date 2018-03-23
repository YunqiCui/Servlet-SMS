


package com.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");


        //Get User input
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("cuiyunqi".equals(username) && "123".equals(password)){
            //Direct to next page Servlet 提供了两种：Sendredirect专向   forward转发
            res.sendRedirect("/mainframe");
        }else{
            res.sendRedirect("/loginframe");

        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        this.doPost(req,res);

    }
}
