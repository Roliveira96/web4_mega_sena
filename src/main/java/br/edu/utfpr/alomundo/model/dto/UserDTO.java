package br.edu.utfpr.alomundo.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserDTO {

    @NonNull
    private Long id;

    @NonNull
    private String name;

}
