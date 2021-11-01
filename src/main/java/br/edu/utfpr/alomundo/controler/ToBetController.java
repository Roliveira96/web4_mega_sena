package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.service.BetService;

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
     //   System.out.println("Nome dentro do Game: " + name);


        if (name == null) {
            // request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
           // System.out.println("Dentro do IF");
            request.getRequestDispatcher("/WEB-INF/view/toBet.jsp").forward(request, response);
        } else {
           // System.out.println("Nome: " + name);

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
   // request.getRequestDispatcher("/confirmacao").forward(request, response);

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

     //   System.out.println("Dentro do CreatBet");
        ArrayList<Integer> bet = new ArrayList<Integer>();

        bet = convertArrayStringInArrayInteger(betPOST);
        double value = valueBet(valuePost);
        Bet bt = new Bet(betPOST, probability, value);

//        System.out.println("Bets: ");
//        System.out.println(bt.getBet());
//        System.out.println(bt.getValue());
//        System.out.println(" fim Bets: ");

        return bt;

    }

    private double valueBet(String valuePost) {
       // System.out.println("Dentro do ValueBet");
        return Double.parseDouble(valuePost);
    }



}
