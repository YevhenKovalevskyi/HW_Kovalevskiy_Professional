package com.cbsystematics.homeworks.hw14.task3;

import lombok.SneakyThrows;

public class WaitNotify {
    
    public static final Object Lock1 = new Object();
    public static final Object Lock2 = new Object();
    
    private static class Thread1 extends Thread {
        
        @SneakyThrows
        public void run() {
            synchronized (WaitNotify.Lock1) {
                System.out.println("Thread1: Holding lock 1...");
                Thread.sleep(10);
                System.out.println("Thread1: Waiting for lock 2...");
                
                synchronized (WaitNotify.Lock2) {
                    System.out.println("Thread1: Holding lock 1 & 2...");
                    WaitNotify.Lock2.notify();
                }
            }
        }
    }
    
    private static class Thread2 extends Thread {
        
        @SneakyThrows
        public void run() {
            synchronized (WaitNotify.Lock2) {
                System.out.println("Thread2: Holding lock 2...");
                Thread.sleep(10);
                System.out.println("Thread2: Waiting for lock 1...");
                
                synchronized (WaitNotify.Lock1) {
                    System.out.println("Thread2: Holding lock 1 & 2...");
                }
            }
        }
    }
    
    @SneakyThrows
    public static void main(String[] args) {
        Thread1 T1 = new WaitNotify.Thread1();
        Thread2 T2 = new WaitNotify.Thread2();
        
        T1.start();
        
        synchronized (WaitNotify.Lock2) {
            WaitNotify.Lock2.wait();
        }
        
        T2.start();
    }
}
