package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.service.BetService;
import br.edu.utfpr.alomundo.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;


@WebServlet(name = "toBetController", value = "/aposta")
public class ToBetController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("toBetController - /aposta - doGet");

        String name = request.getParameter("name");


        if (name == null) {
            request.getRequestDispatcher("/WEB-INF/view/toBet.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/view/megasena.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("toBetController - /aposta - doPost");

        String betPost = request.getParameter("bet");
        String valuePost = request.getParameter("valorInp");
        String probability = request.getParameter("probabilityInp");


        Bet bet = createBet(betPost, probability, valuePost);


        request.setAttribute("flash.betObj", bet);
        request.setAttribute("flash.betString", betPost);
        System.out.println("Erro aqui");

        response.sendRedirect("finalizacao");

    }

    private ArrayList<Integer> convertArrayStringInArrayInteger(String betPOST) {
        //System.out.println("Dentro do convertArrayStringInArrayInteger");
        ArrayList<String> betArrayString = new ArrayList<String>(Arrays.asList(betPOST.split(",")));
        ArrayList<Integer> betArrayInteger = new ArrayList<Integer>();

        for (String number : betArrayString) {
            betArrayInteger.add(parseInt(number));
        }

        return betArrayInteger;
    }

    public Bet createBet(String betPOST, String probability, String valuePost) {

        ArrayList<Integer> bet = new ArrayList<Integer>();

        bet = convertArrayStringInArrayInteger(betPOST);
        double value = valueBet(valuePost);
        Bet bt = new Bet(Constants.ID_USER, betPOST, probability, value);

        return bt;

    }

    private double valueBet(String valuePost) {
        return Double.parseDouble(valuePost);
    }

}
