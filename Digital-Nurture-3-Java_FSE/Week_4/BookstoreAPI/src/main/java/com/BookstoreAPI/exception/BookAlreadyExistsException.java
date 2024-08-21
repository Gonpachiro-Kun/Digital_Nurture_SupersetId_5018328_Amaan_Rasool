package com.BookstoreAPI.exception;

public class BookAlreadyExistsException extends Exception{

    public BookAlreadyExistsException() {

    }

    public BookAlreadyExistsException(String message) {
        super(message);
    }
}
