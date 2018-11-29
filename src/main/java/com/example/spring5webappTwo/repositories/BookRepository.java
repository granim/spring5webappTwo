package com.example.spring5webappTwo.repositories;

import com.example.spring5webappTwo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
