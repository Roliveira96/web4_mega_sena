package br.edu.utfpr.alomundo.controler;

import br.edu.utfpr.alomundo.model.dao.LotteryDrawingDAO;
import br.edu.utfpr.alomundo.model.domain.LotteryDrawing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet(name = "sorteios", value = "/sorteios")
public class SorteiosController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sorteios - /sorteios - doGET");

        LotteryDrawingDAO lt = new LotteryDrawingDAO();
        ArrayList arrayList = (ArrayList) lt.findAll();

        request.setAttribute("drawings", arrayList);

        request.getRequestDispatcher("/WEB-INF/view/sorteios.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sorteios - /sorteiossorteios - doPOST");


    }

}
