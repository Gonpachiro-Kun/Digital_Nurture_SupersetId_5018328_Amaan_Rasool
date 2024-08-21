package com.BookstoreAPI.config;

import com.BookstoreAPI.dto.BookDTO;
import com.BookstoreAPI.dto.CustomerDTO;
import com.BookstoreAPI.model.Book;
import com.BookstoreAPI.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Custom mapping for Book to BookDTO
        modelMapper.addMappings(new PropertyMap<Book, BookDTO>() {
            @Override
            protected void configure() {
                map().setCust_id(source.getCustomer().getCust_id());
            }
        });

        // Custom mapping for Customer to CustomerDTO
        modelMapper.addMappings(new PropertyMap<Customer, CustomerDTO>() {
            @Override
            protected void configure() {
                map().setCust_id(source.getCust_id());
                using(ctx -> {
                    List<Book> books = (List<Book>) ctx.getSource();
                    return books.stream().map(Book::getId).toList();
                }).map(source.getBook(), destination.getId());
            }
        });

        return modelMapper;
    }
}