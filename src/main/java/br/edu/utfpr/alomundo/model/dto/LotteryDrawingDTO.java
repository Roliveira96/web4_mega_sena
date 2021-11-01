package br.edu.utfpr.alomundo.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class LotteryDrawingDTO {

    @NonNull
    private String lotteryDrawing;
    @NonNull
    private double value;


}
