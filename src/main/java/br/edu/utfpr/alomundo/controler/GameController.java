package br.edu.utfpr.alomundo.controler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Game", value = "/megasena")
public class GameController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("GameController - /megasena - doGet");
        String name = null;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("nameUser")) {
                    name = cookies[i].getValue();
                    request.setAttribute("name", name);
                    request.getRequestDispatcher("/WEB-INF/view/game.jsp").forward(request, response);
                }
            }
        } else {
            request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
        }
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        System.out.println("GameController - /megasena - doPost");
        request.getRequestDispatcher("/WEB-INF/view/game.jsp").forward(request, response);


    }
}
