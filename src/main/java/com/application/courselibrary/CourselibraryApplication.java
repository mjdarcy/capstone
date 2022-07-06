package com.application.courselibrary;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.entity.Book;
import com.application.courselibrary.entity.Category;
import com.application.courselibrary.entity.Publisher;
import com.application.courselibrary.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourselibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourselibraryApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args) -> {
            Book book1 = new Book("9780307387899", "The Road", "287 pages");
            Author author1 = new Author("Cormac McCarthy", "American novelist and playwright");
            Category category1 = new Category("Literary Fiction");
            Publisher publisher1 = new Publisher("Knopf Doubleday Publishing Group");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

            Book book2 = new Book("0062060627", "The Song of Achilles", "416 pages");
            Author author2 = new Author("Madeline Miller", "2019 recipient of the Alex Awards");
            Category category2 = new Category("Historical Fiction");
            Publisher publisher2 = new Publisher("Ecco Press");
            book2.addAuthor(author2);
            book2.addCategory(category2);
            book2.addPublisher(publisher2);
            bookService.createBook(book2);

            Book book3 = new Book("0812550706", "Ender's Game", "352 pages");
            Author author3 = new Author("Orson Scott Card", "Only recipient of Hugo Award and a Nebula Award in consecutive years");
            Category category3 = new Category("Science Fiction");
            Publisher publisher3 = new Publisher("Tor Science Fiction");
            book3.addAuthor(author3);
            book3.addCategory(category3);
            book3.addPublisher(publisher3);
            bookService.createBook(book3);
        };
    }

}
