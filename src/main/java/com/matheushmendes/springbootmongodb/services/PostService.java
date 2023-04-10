package com.matheushmendes.springbootmongodb.services;

import com.matheushmendes.springbootmongodb.domain.Post;
import com.matheushmendes.springbootmongodb.repositories.PostRepository;
import com.matheushmendes.springbootmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object Not Found!"));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.searchTitle(text);
    }
}
