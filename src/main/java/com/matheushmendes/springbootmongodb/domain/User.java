package com.matheushmendes.springbootmongodb.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {
    //It works to convert the objects in bites for transport in ner or files;
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private String id;
    private String name;
    private String email;

    public User(){}

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
