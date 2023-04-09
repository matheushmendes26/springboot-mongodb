package com.matheushmendes.springbootmongodb.dto;

import com.matheushmendes.springbootmongodb.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public AuthorDTO(){}

    public AuthorDTO(User obj){
        id= obj.getId();
        name = obj.getName();
    }
}
