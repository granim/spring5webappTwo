package com.example.spring5webappTwo.repositories;

import com.example.spring5webappTwo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

    public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
