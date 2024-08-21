package com.BookstoreAPI.service;

import com.BookstoreAPI.exception.BookAlreadyExistsException;
import com.BookstoreAPI.model.Book;
import com.BookstoreAPI.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final Book_Repository bookRepository;

    @Autowired
    public BookService(Book_Repository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findByName(title);
    }

    public Book saveBook(Book book) throws BookAlreadyExistsException{
        String mytitle = book.getTitle();
        List<Book> mybook = bookRepository.findByName(mytitle);
        if (mybook.isEmpty()){
            return bookRepository.save(book);
        }
        else{
            throw new BookAlreadyExistsException("Book already exists");
        }
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setPrice(bookDetails.getPrice());
        book.setIsbn(bookDetails.getIsbn());
        return bookRepository.save(book);
    }
}