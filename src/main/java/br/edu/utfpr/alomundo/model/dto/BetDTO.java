package br.edu.utfpr.alomundo.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class BetDTO {

    @NonNull
    private Long idUser;
    @NonNull
    private String bet;
    @NonNull
    private double value;
    @NonNull
    private String probability;

}
