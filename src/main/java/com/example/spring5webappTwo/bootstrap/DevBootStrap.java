package com.example.spring5webappTwo.bootstrap;

import com.example.spring5webappTwo.model.Author;
import com.example.spring5webappTwo.model.Book;
import com.example.spring5webappTwo.model.Publisher;
import com.example.spring5webappTwo.repositories.AuthorRepository;
import com.example.spring5webappTwo.repositories.BookRepository;
import com.example.spring5webappTwo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    private void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("Harper Collins");

        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book dd = new Book("Doman Driven", "1234", publisher);
        eric.getBooks();
        dd.getAuthors();

        authorRepository.save(eric);
        bookRepository.save(dd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("JZEE Development", "12345", publisher);
        rod.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }

}
