package com.BookstoreAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Title cannot be empty")
    private String title;

    @Column(name = "author")
    @NotEmpty(message = "Name of the author cannot be empty")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Price cannot be null")
    private Long price;

    @Column(name = "ISBN")
    @NotEmpty(message = "ISBN cannot be empty")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;
}