package com.cbsystematics.homeworks.hw14.task3;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
    
    public static Lock lock = new ReentrantLock();
    public static final Object Lock1 = new Object();
    public static final Object Lock2 = new Object();
    
    private static class Thread1 extends Thread {
        
        @SneakyThrows
        public void run() {
            TryLock.lock.lock();
            
            synchronized (TryLock.Lock1) {
                System.out.println("Thread1: Holding lock 1...");
                Thread.sleep(10);
                System.out.println("Thread1: Waiting for lock 2...");
        
                synchronized (TryLock.Lock2) {
                    System.out.println("Thread1: Holding lock 1 & 2...");
                }
            }
    
            TryLock.lock.unlock();
    
            System.out.println("Thread1: has freed!");
        }
    }
    
    private static class Thread2 extends Thread {
        
        @SneakyThrows
        public void run() {
            while (true) {
                if (TryLock.lock.tryLock()) {
                    synchronized (TryLock.Lock2) {
                        System.out.println("Thread2: Holding lock 2...");
                        Thread.sleep(10);
                        System.out.println("Thread2: Waiting for lock 1...");
        
                        synchronized (TryLock.Lock1) {
                            System.out.println("Thread2: Holding lock 1 & 2...");
                        }
                    }
                    
                    System.out.println("Thread2: has freed!");
                    
                    break;
                } else {
                    Thread.sleep(1);
                    System.out.println("Thread2 waiting...");
                }
            }
        }
    }
    
    @SneakyThrows
    public static void main(String[] args) {
        new TryLock.Thread1().start();
        new TryLock.Thread2().start();
    }
}
