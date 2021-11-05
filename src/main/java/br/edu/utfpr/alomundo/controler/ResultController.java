package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.dao.BetDAO;
import br.edu.utfpr.alomundo.model.domain.Bet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "result", value = "/resultado")
public class ResultController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("resultController - /resultado - doGet");
        String idUserSt = null;
        for (Cookie cookie : request.getCookies())
            if (cookie.getName().equals("idUser")) {
                idUserSt = cookie.getValue();

            }
        Long idUser = Long.parseLong(idUserSt, 10);
        System.out.println(idUser);

BetDAO bet = new BetDAO();



// Bet theBet = (Bet) bet.listByProperty("idUser",idUser);

       // System.out.println("teste: "+ theBet.getBet());


        request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resultController - /resultado - doPost");


    }
}
