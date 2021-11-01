package br.edu.utfpr.alomundo.controler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        System.out.println(name);

        Cookie cookie = new Cookie("nameUser", String.valueOf(name));
        cookie.setMaxAge(60 * 60 * 12);
        response.addCookie(cookie);

        request.setAttribute("name", name);
        request.setAttribute("flash.name", name);
        System.out.println("Dentro do POST login");
        response.sendRedirect("megasena");
        //  request.getRequestDispatcher("/WEB-INF/view/game.jsp").forward(request, response);

    }

}
