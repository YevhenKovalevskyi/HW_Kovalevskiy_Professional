package com.cbsystematics.homeworks.hw15.task3;

import java.util.Objects;

/**
 * Book Class represents object Book
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Book {
    
    private final int id;
    private final String title;
    private String author;
    private String ISBN;
    private String publisher;
    private final int year;
    
    public Book(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return this.id;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public String getPublisher() {
        return this.publisher;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }
    
    public Book setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }
    
    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title, this.author, this.ISBN, this.publisher, this.year);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Book)) return false;
    
        Book book = (Book) obj;
        
        return (this.id == book.id) &&
                Objects.equals(this.title, book.title) &&
                Objects.equals(this.author, book.author) &&
                Objects.equals(this.ISBN, book.ISBN) &&
                Objects.equals(this.publisher, book.publisher) &&
                (this.year == book.year);
    }
    
    @Override
    public String toString() {
        return "Book [ " +
                "title: " + this.title + " | " +
                "author: " + this.author + " | " +
                "ISBN: " + this.ISBN + " | " +
                "publisher: " + this.publisher + " | " +
                "year: " + this.year +
                " ]";
    }
}
