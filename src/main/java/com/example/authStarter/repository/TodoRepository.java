package com.example.authStarter.repository;

import com.example.authStarter.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {

    List<Todo> findByTitleContaining(String title);
}