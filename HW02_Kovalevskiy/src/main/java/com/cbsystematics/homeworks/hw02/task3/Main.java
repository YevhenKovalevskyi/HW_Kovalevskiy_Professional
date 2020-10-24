package com.cbsystematics.homeworks.hw02.task3;

import com.cbsystematics.homeworks.hw02.task3.exceptions.EmptyCollectionError;
import com.cbsystematics.homeworks.hw02.task3.services.CollectionService;
import com.cbsystematics.homeworks.hw02.task3.services.ConsoleService;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main Class represents homework #2 #task3
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) throws EmptyCollectionError {
        runConsoleWorker();
    }
    
    /**
     * The method takes the input from the console, run worker and print information
     */
    public static void runConsoleWorker() throws EmptyCollectionError {
        System.out.println("-> Hello! This is a simple worker runner.");
        System.out.println("-> You can type any integer.");
        System.out.println("-> If you want to exit this program - type \"exit\" !\n");
        
        Scanner in = new Scanner(System.in);

        int listLength, consoleInteger;
        LinkedList<Integer> integersList = new LinkedList<>();

        listLength = ConsoleService.getConsoleNumberDataExtra(in);
        
        do {
            consoleInteger = ConsoleService.getConsoleNumberData(in);
            integersList.add(consoleInteger);
        } while (integersList.size() < listLength);
        
        in.close();
        
        System.out.println();
        
        if (integersList.isEmpty()) {
            System.out.println("-> The list is empty! How did you do that?\n");
            System.exit(0);
        }
    
        System.out.println("Minimal list element is: " + CollectionService.getMinimumItemCase1(integersList));
        System.out.println("Minimal list element is: " + CollectionService.getMinimumItemCase2(integersList));
        System.out.println("Minimal list element is: " + CollectionService.getMinimumItemCase3(integersList));
        System.out.println("Minimal list element is: " + CollectionService.getMinimumItemCase4(integersList));
        System.out.println("Minimal list element is: " + CollectionService.getMinimumItemCase5(integersList));
    }
}

/*
 - вопрос:
   В данной задаче я разделил получение чисел из консоли на 2 отдельных метода.
   Разница между ними в дополнительной проверке.
   И дабы не перегружать простой метод лишней логикой(которой может быть больше),
   я сделал 2 отдельных.
   Насколько данный подход адэкватен? Атомарность и все такое... но в то же время это не DRY
   Или стоит все сделать в одном методе?
*/