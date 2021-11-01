package br.edu.utfpr.alomundo.model.domain;

import br.edu.utfpr.alomundo.util.Constants;
import br.edu.utfpr.alomundo.util.ConvertBet;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Integer.parseInt;

@Entity
@Table(name = "drawings")
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)


public class LotteryDrawing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String lotterydrawing;

    @NonNull
    private double value;


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

    public String drawing() {
        int[] sorteados = new int[6];
        System.out.println("___________________________________");
        sorteados = sorteioCartao();
        String sorteio = "";
        sorteio += sorteados[0] + ",";
        for (int i = 1; i < sorteados.length - 1; i++)
            sorteio += sorteados[i] + ",";
        sorteio += sorteados[5];
        System.out.println("___________________________________");

        System.out.println(sorteio);

        return sorteio;
    }


    private int[] sorteioCartao() {
        int[] sorteio = new int[6];
        sorteio = confereSeIgualOrdena();
        return sorteio;
    }

    private int[] confereSeIgualOrdena() {

        int numero;
        int[] num = new int[6];
        Random r = new Random();


        for (int i = 0; i < 6; i++) {
            num[i] = r.nextInt(59) + 1;
            numero = num[i];
            for (int j = 0; j < i; j++) {
                if (num[j] == numero) {
                    i--;
                }
            }

        }

        //Ordenação pronta que coisa boa isso.
        Arrays.sort(num);

        return num;

    }

    public int acetos(String bet, String drawing) {
        ArrayList betArr, drawingArr = new ArrayList();
        ConvertBet cv = new ConvertBet();
        int acertos = 0;
        betArr = cv.stringInArray(bet);
        drawingArr = cv.stringInArray(drawing);

        for (int i = 0; i < betArr.size(); i++) {
            for (int j = 0; j < drawingArr.size(); j++) {
                if (betArr.get(i).equals(drawingArr.get(j)))
                    acertos++;
            }
        }
        System.out.println("Acertos: "+ acertos);

        return acertos;
    }

    private String vereficaSeGanhou(int acertos) {

        switch (acertos) {
            case 0:
                return "Melhor na próxima, mas como é sempre dito azar  no jogo sorte no amor!";

            case 1:
                return "Opa, acertou 1 só falta mais 5 rsrs tente novamente";

            case 2:
                return "Acertou 2, que maravilha, só falta comprar um pé de coelho e jogar novamente!";

            case 3:
                return "Acertou 3, se continuar assim vai ganhar bastante dinheiro";

            case 4:
                return "Acertou 4, já ganhou na quadra, mais ainda falta acertar mais";
            case 5:
                return "Acertou 5, já ganhou na quina, já dá de gastar um pouco em uma viagem";

            case 6:
                return "Acertou 6, huhu Ganhou na megasena reparte o dinheiro aí";

            default:
                return "error";


        }
    }

}