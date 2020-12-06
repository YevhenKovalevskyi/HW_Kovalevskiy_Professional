package com.cbsystematics.homeworks.hw13.task2;

import lombok.SneakyThrows;

public class Main {
    
    @SneakyThrows(InterruptedException.class)
    public static synchronized void threadAction(Thread thread) {
        System.out.println();
        
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println("- " + thread.getName() + ": " + i);
        }
        
        System.out.println(thread.getName() + " finished");
    }
    
    public static void main(String[] args) {
        new MyThread("first");
        new MyThread("second");
        new MyThread("third");
    }
}

class MyThread implements Runnable {
    
    String name;
    Thread thread;
    
    public MyThread(String name) {
        this.thread = new Thread(this, name);
        this.name = name;
        System.out.println("Created \"" + this.name.toLowerCase() + "\" thread!");
        this.thread.start();
    }
    
    @Override
    public void run() {
        Main.threadAction(this.thread);
    }
}
