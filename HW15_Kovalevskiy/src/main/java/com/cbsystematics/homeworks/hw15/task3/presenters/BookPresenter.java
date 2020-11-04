package com.cbsystematics.homeworks.hw15.task3.presenters;

import com.cbsystematics.homeworks.hw15.task3.Book;

public class BookPresenter {
    
    public static String present(Book book) {
        return String.format("| %d | %-23s | %d | %-33s | %-14s | %-12s |",
                book.getId(),
                book.getTitle(),
                book.getYear(),
                book.getAuthor(),
                book.getISBN(),
                book.getPublisher()
        );
    }
}
