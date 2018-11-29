package com.example.spring5webappTwo.repositories;

import com.example.spring5webappTwo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
