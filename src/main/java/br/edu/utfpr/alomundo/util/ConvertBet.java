package br.edu.utfpr.alomundo.util;

import br.edu.utfpr.alomundo.model.domain.Bet;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class ConvertBet {



    private ArrayList<Integer> convertArrayStringInArrayInteger(String betPOST) {
        System.out.println("Dentro do convertArrayStringInArrayInteger");
        ArrayList<String> betArrayString = new ArrayList<String>(Arrays.asList(betPOST.split(",")));
        ArrayList<Integer> betArrayInteger = new ArrayList<Integer>();

        for (String number : betArrayString) {
            betArrayInteger.add(parseInt(number));
        }

        return betArrayInteger;
    }

    public ArrayList<String> stringInArray(String betPOST) {
        System.out.println("Dentro do convertArrayStringInArrayInteger");
        return new ArrayList<String>(Arrays.asList(betPOST.split(",")));
    }

    public Bet createBet(String betPOST, String probability, String valuePost) {

        System.out.println("Dentro do CreatBet");
        ArrayList<Integer> bet = new ArrayList<Integer>();

        bet = convertArrayStringInArrayInteger(betPOST);
        double value = valueBet(valuePost);
        Bet bt = new Bet(betPOST, probability, value);

        System.out.println("Bets: ");
        System.out.println(bt.getBet());
        System.out.println(bt.getValue());
        System.out.println(" fim Bets: ");

        return bt;

    }

    private double valueBet(String valuePost) {
        System.out.println("Dentro do ValueBet");
        return Double.parseDouble(valuePost);
    }



}
