package br.edu.utfpr.alomundo.controler;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@WebServlet(name = "AgeCalculatorServlet", value = "/calculadora-idade")
public class AgeCalculatorController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("nome");
        String year = request.getParameter("ano");

        String dir = "/WEB-INF/view/";

        if (name == null || year == null)
            request.getRequestDispatcher("/WEB-INF/view/age-calculator.jsp").forward(request, response);
        else {
            System.out.println("Nome: " +name + "Idade: "+ year);

            Integer yearInt = Integer.parseInt(year);
            int age = calculatorAge(yearInt);
            request.setAttribute("age", age);
            request.setAttribute("name", name);
            request.getRequestDispatcher("/WEB-INF/view/age-result.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        String year = request.getParameter("year");


        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        String dateFormatted = f.format(calendar.getTime());

        Integer yearInt = Integer.parseInt(year);
        int age = calculatorAge(yearInt);

//        request.setAttribute("age", age);
//        request.setAttribute("name", name);
//        request.setAttribute("date", dateFormatted);

request.setAttribute("flash.age",age);
request.setAttribute("flash.date",dateFormatted);
response.sendRedirect("resultado-idade");

        //request.getRequestDispatcher("/WEB-INF/view/age-result.jsp").forward(request, response);

    }

    private int calculatorAge(int year) {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        return yearNow - year;
    }
}
