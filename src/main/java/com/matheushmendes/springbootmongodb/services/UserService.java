package com.matheushmendes.springbootmongodb.services;

import com.matheushmendes.springbootmongodb.domain.User;
import com.matheushmendes.springbootmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
