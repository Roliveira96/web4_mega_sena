package br.edu.utfpr.alomundo.model.mapper;

import br.edu.utfpr.alomundo.model.domain.Bet;
import br.edu.utfpr.alomundo.model.dto.BetDTO;
import br.edu.utfpr.alomundo.util.Constants;

public class BetMapper {

    public static Bet toEntity(BetDTO dto){
        Bet entity = new Bet(Constants.ID_USER ,dto.getBet(), dto.getProbability(), dto.getValue());
        return entity;
    }

    public static BetDTO toDTO(Bet entity){
        System.out.println("teste toDTO");
        System.out.println(entity.getBet());
  //  BetDTO dto = new BetDTO(entity.getBet(), entity.getValue(), entity.getProbability());
    BetDTO dto = new BetDTO(Constants.ID_USER,entity.getBet(),entity.getValue(),entity.getProbability());
        return dto;
    }
}
