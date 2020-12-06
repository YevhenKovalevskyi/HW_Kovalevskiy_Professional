package com.cbsystematics.homeworks.hw14.taskExtra;

import lombok.SneakyThrows;

public class Main {
    
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Main Thread has created!");
        
        new WorkerThread("Worker");
        
        Thread.sleep(7500);
    
        System.out.println("\nMain Thread has ended!");
    }
}

class WorkerThread implements Runnable {
    
    String name;
    Thread thread;
    
    public WorkerThread(String name) {
        this.thread = new Thread(this, name);
        this.name = name;
        System.out.println(this.name + " Thread has created!\n");
        this.thread.setDaemon(true);
        this.thread.start();
    }
    
    @SneakyThrows
    public void run() {
        int count = 0;

        while (true) {
            System.out.println("- Hello from " + this.name + " Thread " + count++);
    
            Thread.sleep(2000);
        }
    }
}
