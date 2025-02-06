package com.dp.creational.singleton;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Singleton {

    private static Singleton instance;

    private static int index = 0;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        index++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getIndex() {
        return index;
    }

    public void printIndex() {
        System.out.println("index:" + index);
    }

    public static void main(String[] args) {

        System.out.println("start...");

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        for (long i = 0; i < 5000000; i++) {
            executor.execute(new MyRunnable());
        }

        executor.shutdown();

        System.out.println("end.");

    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        if (singleton.getIndex() != 1) {
            System.out.println("index:" + singleton.getIndex());
        }
    }
}
