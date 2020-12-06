package com.cbsystematics.homeworks.hw14.task2;

import lombok.SneakyThrows;

public class Main {
    
    public static final Object Lock1 = new Object();
    public static final Object Lock2 = new Object();
    
    private static class Thread1 extends Thread {
        
        @SneakyThrows
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread1: Holding lock 1...");
                Thread.sleep(10);
                System.out.println("Thread1: Waiting for lock 2...");
                
                synchronized (Lock2) {
                    System.out.println("Thread1: Holding lock 1 & 2...");
                }
            }
        }
    }
    
    private static class Thread2 extends Thread {
    
        @SneakyThrows
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread2: Holding lock 2...");
                Thread.sleep(10);
                System.out.println("Thread2: Waiting for lock 1...");
                
                synchronized (Lock1) {
                    System.out.println("Thread2: Holding lock 1 & 2...");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Thread1 T1 = new Main.Thread1();
        Thread2 T2 = new Main.Thread2();
        T1.start();
        T2.start();
    }
}

