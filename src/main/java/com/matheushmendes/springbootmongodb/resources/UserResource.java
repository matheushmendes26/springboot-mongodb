package com.matheushmendes.springbootmongodb.resources;

import com.matheushmendes.springbootmongodb.domain.User;
import com.matheushmendes.springbootmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController //Identify a resource rest
@RequestMapping(value = "/users") //Set the route of the resource
public class UserResource {

    @Autowired
    private UserService userService;

    //alternative way to mapping and set method http is @GetMapping for method Get
    @RequestMapping(method = RequestMethod.GET)//to set endpoint way for the rout "/users"
    public ResponseEntity<List<User>> findAll(){

        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
