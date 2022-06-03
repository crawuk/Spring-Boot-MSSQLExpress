package com.library.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig
{
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book first = new Book(
                    "author_first",
                    "title_first",
                    "1234");

            Book second = new Book(
                    "author_second",
                    "title_second",
                    "5678");

            repository.saveAll(List.of(first, second));
            //repository.save(first);
        };
    }
}
