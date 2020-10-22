package com.cbsystematics.homeworks.hw03.taskExtra;

import com.cbsystematics.homeworks.hw03.taskExtra.objects.MyHashTable;

/**
 * Main Class represents homework #3 #taskExtra
 *
 * @author e.kovalevskiy
 * @version 2.0
 */
public class Main {
    
    public static void main(String[] args) {
        MyHashTable<Integer, String> myHashTable = new MyHashTable<>();
    
        myHashTable.addElement(1, "first");
        myHashTable.addElement(2, "second");
        myHashTable.addElement(3, "third");
        
        System.out.println("MyHashTable size: " + myHashTable.getSize());
        myHashTable.printHashTable();
    
        myHashTable.replaceElement(2, "twenty second");
        myHashTable.replaceElement(3, "third", "thirty third");
        myHashTable.printHashTable();
    
        myHashTable.removeElement(1);
        myHashTable.printHashTable();
        
        System.out.println("Element #1: " + myHashTable.getElement(1));
        System.out.println("Element #2: " + myHashTable.getElement(2));
        System.out.println("Element #3: " + myHashTable.getElement(3));
    }
}

/*
 - Надеюсь я правильно понял суть задания.
   Нечто подобное(практически то же самое) уже было в 10-м задании предыдущего раздела.
 */
