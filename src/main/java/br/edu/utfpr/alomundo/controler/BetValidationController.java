package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.service.BetService;
import lombok.NonNull;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "BetValidationController", value = "/confirmacao")
public class BetValidationController extends HttpServlet {

    //BetService betService = new BetService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BetValidationController - /confirmacao - doGet");

     request.getRequestDispatcher("/WEB-INF/view/betConfirmation.jsp").forward(request, response);


//        String bet = request.getParameter("betString");
//        System.out.println(bet);
//        String valueBet = request.getParameter("valuaBet");
//        String probability = request.getParameter("probability");
//
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (int i = 0; i < cookies.length; i++) {
//                if (cookies[i].getName().equals("BetCookie")) {
//                    String BetCookie = cookies[i].getValue();
//                    request.setAttribute("BetCookie", BetCookie);
//                    request.getRequestDispatcher("/WEB-INF/view/betConfirmation.jsp").forward(request, response);
//                }
//            }
//        } else {
//            request.getRequestDispatcher("/WEB-INF/view/game.jsp").forward(request, response);
//
//        }
//        request.setAttribute("betObj", bet);
//
//        System.out.println("Aqui erro");
//        request.getRequestDispatcher("/WEB-INF/view/betConfirmation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BetValidationController - /confirmacao - doPost");


        String bet = request.getParameter("bet");


        Bet betObj = new Bet();

        ArrayList<Integer> betList = betObj.convertArrayStringInArrayInteger(bet);

        int betValue = betObj.betGetValue(betList);


        betObj.setValue(betValue);
        betObj.setBet(bet);
        betObj.setProbability("De ganhar!");


        request.setAttribute("flash.betString", bet);
        request.setAttribute("flash.betObj", betObj);
        response.sendRedirect("finalizacao");


//        request.setAttribute("betObj", bet);
//        request.setAttribute("betString", betPost);
//
        //request.getRequestDispatcher("/confirmacao").forward(request, response);
//
//

    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("Aqui dentro do Bet Validation");
    }

//    private boolean BetValidator(String betNumbers) {
//
//        if (!(betNumbers == null)) {
//            Bet bet = new Bet();
//            ArrayList<String> betList = bet.toStringInToArray(betNumbers);
//            int betvalue = bet.betGetValue(betList);
//
//        }
//        return false;
//    }


}
