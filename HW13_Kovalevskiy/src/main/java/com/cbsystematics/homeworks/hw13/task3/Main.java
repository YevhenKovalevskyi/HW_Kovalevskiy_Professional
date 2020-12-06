package com.cbsystematics.homeworks.hw13.task3;

import lombok.SneakyThrows;

import java.util.Random;

public class Main {
    
    @SneakyThrows(InterruptedException.class)
    public static void threadAction(Thread thread) {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("- " + thread.getName() + "[" + thread.getPriority() + "]: " + i);
        }

        System.out.println(thread.getName() + " finished");
    }
    
    public static int getPriority() {
        int priority = new Random().nextInt(10);
        
        return Math.max(priority, 1);
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
        this.name = name;
        this.thread = new Thread(this, name);
        
        System.out.println("Created \"" + this.name.toLowerCase() + "\" thread!");

        this.thread.setPriority(Main.getPriority());
        this.thread.start();
    }
    
    @Override
    public void run() {
        Main.threadAction(this.thread);
    }
}
