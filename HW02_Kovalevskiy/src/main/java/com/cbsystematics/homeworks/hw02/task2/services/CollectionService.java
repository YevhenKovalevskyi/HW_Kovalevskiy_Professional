package com.cbsystematics.homeworks.hw02.task2.services;

import java.util.List;

/**
 * CollectionService Class represents methods for working with collections
 *
 * @author e.kovalevskiy
 * @version 1.0
 */
public class CollectionService {
    
    /**
     * The method takes list and doubles each item
     *
     * @param <T>
     * @param list
     */
    public static <T> void doubleValues(List<T> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i += 2) {
                list.add(i, list.get(i));
            }
        }
    }
}
