package br.edu.utfpr.alomundo.model.mapper;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.model.domain.LotteryDrawing;
import br.edu.utfpr.alomundo.model.dto.BetDTO;
import br.edu.utfpr.alomundo.model.dto.LotteryDrawingDTO;

public class LotteryDrawingMapper {

    public static LotteryDrawing toEntity(LotteryDrawingDTO dto){
        LotteryDrawing entity = new LotteryDrawing(dto.getBet(), dto.getValue());
        return entity;
    }

    public static BetDTO toDTO(Bet entity){
        System.out.println("teste toDTO");
        System.out.println(entity.getBet());
  //  BetDTO dto = new BetDTO(entity.getBet(), entity.getValue(), entity.getProbability());
    BetDTO dto = new BetDTO(entity.getBet(),entity.getValue(),entity.getProbability());
        return dto;
    }
}
