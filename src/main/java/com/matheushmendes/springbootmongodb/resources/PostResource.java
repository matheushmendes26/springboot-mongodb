package com.matheushmendes.springbootmongodb.resources;

import com.matheushmendes.springbootmongodb.domain.Post;
import com.matheushmendes.springbootmongodb.domain.User;
import com.matheushmendes.springbootmongodb.dto.UserDTO;
import com.matheushmendes.springbootmongodb.services.PostService;
import com.matheushmendes.springbootmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;


@RestController //Identify a resource rest
@RequestMapping(value = "/posts") //Set the route of the resource
public class PostResource {


    @Autowired
    private PostService postService;
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)//to set endpoint way for the rout "/users"
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }
}
