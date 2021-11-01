package br.edu.utfpr.alomundo.service;

import br.edu.utfpr.alomundo.model.dao.BetDAO;
import br.edu.utfpr.alomundo.model.dao.LotteryDrawingDAO;
import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.model.domain.LotteryDrawing;

public class LotteryDrawingService extends AbstractService<Long, LotteryDrawing> {
    public LotteryDrawingService() {

        System.out.println("Criando betDAO");
        dao = new LotteryDrawingDAO();
    }



}
