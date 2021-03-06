package com.cbsystematics.homeworks.hw03.taskExtra.objects;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Main MyHashTable represents object
 *
 * @author e.kovalevskiy
 * @version 2.0
 */
public class MyHashTable<K, V> {
    
    private final HashMap<K, V> hashTable;
    private int hashTableSize;
    
    public MyHashTable() {
        this.hashTable = new HashMap<>();
    }
    
    /**
     * override Map method "size()"
     *
     * @return Map size
     */
    public int getSize() {
        return this.hashTableSize;
    }
    
    /**
     * override Map method "putIfAbsent(K key, V value)"
     * @param key of Map entry
     * @param value of Map entry
     */
    public void addElement(K key, V value) {
        if (this.hashTable.putIfAbsent(key, value) != null) {
            System.out.printf("The element with key \"%s\" already exists. The addElement operation failed.\n", key);
        } else {
            this.hashTableSize = this.hashTable.size();
        }
    }
    
    /**
     * override Map method "get(K key)"
     * @param key of Map entry
     * @return value of Map entry
     */
    public V getElement(K key) {
        V value;
        
        if ((value = this.hashTable.get(key)) == null) {
            System.out.printf("The element with key \"%s\" does not exist. The getElement operation failed.\n", key);
        }
        
        return value;
    }
    
    /**
     * override Map method "replace(K key, V value)"
     * @param key of Map entry
     * @param newValue of Map entry
     */
    public void replaceElement(K key, V newValue) {
        V currValue;
        
        if (!this.hashTable.containsKey(key)) {
            System.out.printf("The element with key \"%s\" does not exist. The replaceElement operation failed.\n", key);
        } else if ((currValue = this.hashTable.get(key)).equals(newValue)) {
            System.out.printf(
                    "Elements newValue \"%s\" and currValue \"%s\" are the same. The replaceElement operation failed.\n",
                    newValue,
                    currValue
            );
        } else {
            this.hashTable.replace(key, newValue);
            System.out.println("The element has been replaced.");
        }
    }
    
    /**
     * override Map method "replace(K key, V oldValue, V newValue)"
     * @param key of Map entry
     * @param oldValue of Map entry
     * @param newValue of Map entry
     */
    public void replaceElement(K key, V oldValue, V newValue) {
        V currValue;
        
        if (!this.hashTable.containsKey(key)) {
            System.out.printf("The element with key \"%s\" does not exist. The replaceElement operation failed.\n", key);
        } else if (!(currValue = this.hashTable.get(key)).equals(oldValue)) {
            System.out.printf(
                    "The element oldValue \"%s\" does not correspond currValue \"%s\". The replaceElement operation failed.\n",
                    oldValue,
                    currValue
            );
        } else {
            this.hashTable.replace(key, oldValue, newValue);
            System.out.println("The element has been replaced.");
        }
    }
    
    /**
     * override Map method "remove(K key)"
     * @param key of Map entry
     */
    public void removeElement(K key) {
        if (!this.hashTable.containsKey(key)) {
            System.out.printf("The element with key \"%s\" does not exist. The removeElement operation failed.\n", key);
        } else {
            this.hashTable.remove(key);
            this.hashTableSize = this.hashTable.size();
            System.out.println("The element has been removed.");
        }
    }
    
    /**
     * override Map method "remove(K key, V value)"
     * @param key of Map entry
     * @param oldValue of Map entry
     */
    public void removeElement(K key, V oldValue) {
        V currValue;
        
        if (!this.hashTable.containsKey(key)) {
            System.out.printf("The element with key %s does not exist. The removeElement operation failed.\n", key);
        } else if (!(currValue = this.hashTable.get(key)).equals(oldValue)) {
            System.out.printf(
                    "The element value \"%s\" does not correspond current value \"%s\". The removeElement operation failed.\n",
                    oldValue,
                    currValue
            );
        } else {
            this.hashTable.remove(key, oldValue);
            this.hashTableSize = this.hashTable.size();
            System.out.println("The element has been removed.");
        }
    }
    
    /**
     * custom Map print method
     */
    public void printHashTable() {
        AtomicInteger counter = new AtomicInteger();
        
        this.hashTable.forEach((key, val) -> {
            counter.getAndIncrement();
            int current = counter.intValue();
            
            String pre = (current == 1) ? "MyHashTable: [ " : "";
            String sep = (current == this.hashTableSize) ? " ]\n" : " | ";
            
            System.out.print(pre + key + " -> " + val + sep);
        });
        
        System.out.println("-----");
    }
}