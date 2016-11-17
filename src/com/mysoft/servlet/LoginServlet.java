package com.mysoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Праворека пароля
        // Должны быть только цифры, длинна от 6 до 16 символов, запрещен пароль "123"
        String pass = request.getParameter("password");
        boolean isCorrect = pass.matches("^(?!.*123$)([0-9]{6,16})$");

        if (isCorrect) {
            request.setAttribute("user", request.getParameter("login"));
            request.getRequestDispatcher("WEB-INF/posts.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Должны быть только цифры, длинна от 6 до 16 символов, запрещен пароль \"123\"");
            request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
    }
}
