package com.cbsystematics.homeworks.hw15.task3;

import com.cbsystematics.homeworks.hw15.task3.presenters.BookPresenter;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Main Class represents homework #15 #task3
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        Book book1 = new Book(2345, "R for Data Science", 2014).setISBN("2-266-11156-6")
                .setAuthor("Garrett Grolemund, Hadley Wickham")
                .setPublisher("O'Reilly Media, Inc");
        Book book2 = new Book(4567, "Building Microservices", 2011).setISBN("978-149195035")
                .setAuthor("Sam Newman")
                .setPublisher("O'Reilly Media, Inc");
        Book book3 = new Book(6721, "Learning the bash Shell", 2010).setISBN("2-266-33356-6")
                .setAuthor("Cameron Newham")
                .setPublisher("O'Reilly Media, Inc");
        Book book4 = new Book(9876, "Clean Code", 2004).setISBN("2-266-22256-6")
                .setAuthor("Robert Cecil Martin")
                .setPublisher("Pearson Education");
        Book book5 = new Book(1890, "Effective Java", 2013).setISBN("978-149192354")
                .setAuthor("Joshua Bloch")
                .setPublisher("Addison Wesley");
        
        Book[] books = {book1, book2, book3, book4, book5};
    
        System.out.println();
        
        Stream.of(books)
                .filter(item -> item.getPublisher().equals("O'Reilly Media, Inc"))
                .sorted(Comparator.comparing(Book::getYear))
                .map(BookPresenter::present)
                .forEach(System.out::println);
        ;
    
        System.out.println();
    }
}
