package com.BookstoreAPI.repository;

import com.BookstoreAPI.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Book_Repository extends JpaRepository<Book, Long> {
    @Query("select x from Book x where x.title = ?1")
    List<Book> findByName(String title);
}
