package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.model.dto.BetDTO;
import br.edu.utfpr.alomundo.service.BetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BetConfirmationController", value = "/finalizacao")
public class BetConfirmationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("BetConfirmationController - /finalizacao - doGet");
//        String bet = request.getParameter("betObj");
//        String valueBet = request.getParameter("valuaBet");
//        String probability = request.getParameter("probability");
        System.out.println("");

        request.getRequestDispatcher("/WEB-INF/view/betConfirmation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BetConfirmationController - /finalizacao - doPOST");


        String betPost = request.getParameter("bet");
        String valuePost = request.getParameter("valor");
        String probability = request.getParameter("probabilityInp");


        System.out.println(betPost + " " + probability + " " + valuePost);



        Bet bet = new Bet(betPost,probability,Double.parseDouble(valuePost));
        getServletContext().setAttribute("bet", bet);
        System.out.println("testst");

//        bet.setProbability(probability);
//        bet.setValue(Double.parseDouble(valuePost));
//        bet.setBet(betPost);

        System.out.println("dasfasgsdgfhdf");


       BetService service = new BetService();


        System.out.println("Salvando");
        service.save(bet);

       // BetDTO betDTO = BetMapper.toDTO(bet);

        System.out.println("Salvo!");


        System.out.println("fdsfsdfdfsad");


        response.sendRedirect("megasena");
        // request.getRequestDispatcher("megasena").forward(request, response);

    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("Aqui dentro do Bet Validation");
    }
}
