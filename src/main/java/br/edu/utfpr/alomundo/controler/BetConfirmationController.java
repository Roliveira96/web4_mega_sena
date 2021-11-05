package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.model.domain.LotteryDrawing;
import br.edu.utfpr.alomundo.service.BetService;
import br.edu.utfpr.alomundo.service.LotteryDrawingService;
import br.edu.utfpr.alomundo.util.Constants;

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


        String betPost = request.getParameter("bet");
        if (betPost != null)
            request.getRequestDispatcher("/WEB-INF/view/game.jsp").forward(request, response);
        else
            request.getRequestDispatcher("/WEB-INF/view/betConfirmation.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BetConfirmationController - /finalizacao - doPOST");


        String betPost = request.getParameter("bet");
        String valuePost = request.getParameter("valor");
        String probability = request.getParameter("probabilityInp");


        System.out.println(betPost + " " + probability + " " + valuePost);


        Bet bet = new Bet(Constants.ID_USER, betPost, probability, Double.parseDouble(valuePost));
        getServletContext().setAttribute("bet", bet);


        BetService service = new BetService();
        LotteryDrawingService lotService = new LotteryDrawingService();


        LotteryDrawing lotteryDrawing = new LotteryDrawing();
        String drawing = lotteryDrawing.drawing();


        System.out.println("Seu Jogo: " + betPost);
        System.out.println("Sorteio: " + drawing);

        int acertos = lotteryDrawing.acetos(betPost, drawing);

        lotteryDrawing.setValue(Constants.VALUE_DRAWING);
        lotteryDrawing.setLotterydrawing(drawing);

        //Salvando...

        lotService.save(lotteryDrawing);
        bet.setAcertos(acertos);
        service.save(bet);

        Integer counterApplication = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_APPLICATION);

        if(counterApplication == null){
            counterApplication = 0;
        }
        counterApplication++;

        getServletContext().setAttribute(Constants.COUNTER_APPLICATION, counterApplication);


        request.setAttribute("flash.bet", bet);
        request.setAttribute("flash.drawing", drawing);
        request.setAttribute("flash.acertos", acertos);

       response.sendRedirect("resultado");

    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Aqui dentro do Bet Validation");
    }
}
