package com.cbsystematics.homeworks.hw02.task3.services;

import com.cbsystematics.homeworks.hw02.task3.exceptions.EmptyCollectionError;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CollectionService Class represents methods for working with collections
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class CollectionService {
    
    /**
     * The method takes list of numbers and find minimum item
     *
     * @param list
     */
    public static Integer getMinimumItemCase1(List<Integer> list) throws EmptyCollectionError {
        if (list.isEmpty()) {
            throw new EmptyCollectionError("List is empty. Operations are impossible.");
        }
    
        return Collections.min(list);
    }
    
    public static Integer getMinimumItemCase2(List<Integer> list) throws EmptyCollectionError {
        if (list.isEmpty()) {
            throw new EmptyCollectionError("List is empty. Operations are impossible.");
        }
        
        return list.stream().min(Integer::compare).get();
    }
    
    public static Integer getMinimumItemCase3(List<Integer> list) throws EmptyCollectionError {
        if (list.isEmpty()) {
            throw new EmptyCollectionError("List is empty. Operations are impossible.");
        }
        
        return list.stream().min(Comparator.naturalOrder()).get();
    }
    
    public static Integer getMinimumItemCase4(List<Integer> list) throws EmptyCollectionError {
        if (list.isEmpty()) {
            throw new EmptyCollectionError("List is empty. Operations are impossible.");
        }
    
        list.sort(Integer::compare);
        
        return list.get(0);
    }
    
    public static Integer getMinimumItemCase5(List<Integer> list) throws EmptyCollectionError {
        if (list.isEmpty()) {
            throw new EmptyCollectionError("List is empty. Operations are impossible.");
        }
        
        list.sort(Comparator.naturalOrder());
        
        return list.get(0);
    }
}
