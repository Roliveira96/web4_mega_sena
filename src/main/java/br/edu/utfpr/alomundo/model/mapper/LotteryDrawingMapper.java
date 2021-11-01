package br.edu.utfpr.alomundo.model.mapper;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.model.domain.LotteryDrawing;
import br.edu.utfpr.alomundo.model.dto.BetDTO;
import br.edu.utfpr.alomundo.model.dto.LotteryDrawingDTO;

public class LotteryDrawingMapper {

    public static LotteryDrawing toEntity(LotteryDrawingDTO dto){
        LotteryDrawing entity = new LotteryDrawing(dto.getLotteryDrawing(), dto.getValue());
        return entity;
    }

    public static LotteryDrawingDTO toDTO(LotteryDrawing entity){

        LotteryDrawingDTO dto = new LotteryDrawingDTO(entity.getLotterydrawing(),entity.getValue());
        return dto;
    }
}
