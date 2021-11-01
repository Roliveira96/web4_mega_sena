package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.domain.User;
import br.edu.utfpr.alomundo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

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


        User user = new User(name);
        UserService service = new UserService();
        service.save(user);


        Cookie ck = new Cookie("nameUser", String.valueOf(name));
        Cookie ck1 = new Cookie("idUser", String.valueOf(user.getId()));

        ck.setMaxAge(60 * 60 * 12);
        response.addCookie(ck);

        ck1.setMaxAge(60 * 60 * 12);
        response.addCookie(ck1);


        request.setAttribute("name", name);
        request.setAttribute("flash.name", name);
        System.out.println("Dentro do POST login");
        response.sendRedirect("megasena");
        //  request.getRequestDispatcher("/WEB-INF/view/game.jsp").forward(request, response);

    }

}
