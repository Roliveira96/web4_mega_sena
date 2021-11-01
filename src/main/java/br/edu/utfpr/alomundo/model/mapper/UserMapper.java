package br.edu.utfpr.alomundo.model.mapper;

import br.edu.utfpr.alomundo.model.domain.User;
import br.edu.utfpr.alomundo.model.dto.UserDTO;

public class UserMapper {

    public static User toEntity(UserDTO dto){
        User entity = new User( dto.getName());
        return entity;
    }

    public static UserDTO toDTO(User entity){
       UserDTO dto = new UserDTO(entity.getId(), entity.getName());
        return dto;
    }
}
