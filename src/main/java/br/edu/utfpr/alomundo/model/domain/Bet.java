package br.edu.utfpr.alomundo.model.domain;

import br.edu.utfpr.alomundo.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

@Entity
@Table(name = "bets")
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)


public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private Long idUser;
    @NonNull
    private String bet;
    @NonNull
    private String probability;
    @NonNull
    private double value;
    private int acertos;


    public int betGetValue(ArrayList<Integer> array) {
        int[] valores = Constants.BET_AMOUNT;
        return valores[array.size() - 6];
    }

    public ArrayList<Integer> convertArrayStringInArrayInteger(String array) {
        ArrayList<String> betArrayString = new ArrayList<String>(Arrays.asList(array.split(",")));
        ArrayList<Integer> betArrayInteger = new ArrayList<Integer>();
        for (String number : betArrayString) {
            betArrayInteger.add(parseInt(number));
        }
        return betArrayInteger;
    }




}