package com.mysoft.servlet;

import com.mysoft.DAO;

import java.io.IOException;
import java.sql.SQLException;


@javax.servlet.annotation.WebServlet(name = "MainServlet", urlPatterns = "/posts")
public class MainServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.getRequestDispatcher("WEB-INF/posts.jsp").forward(request, response);
    }
}
