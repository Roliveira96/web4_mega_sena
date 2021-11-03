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


@WebServlet(name = "sorteios", value = "/sorteios")
public class SorteiosController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sorteios - /sorteios - doGET");

        request.getRequestDispatcher("/WEB-INF/view/sorteios.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sorteios - /sorteiossorteios - doPOST");


    }

}
