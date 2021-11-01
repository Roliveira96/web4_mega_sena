package br.edu.utfpr.alomundo.service;
import br.edu.utfpr.alomundo.model.dao.BetDAO;
import br.edu.utfpr.alomundo.model.domain.Bet;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class BetService  extends AbstractService<Long, Bet> {
    public BetService() {

        System.out.println("Criando betDAO");
        dao = new BetDAO();
    }



}
