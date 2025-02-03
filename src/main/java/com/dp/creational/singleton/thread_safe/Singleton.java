package com.dp.creational.singleton.thread_safe;

import java.util.concurrent.*;

public class Singleton {

    private static int index = 0;

    private Singleton() {
        index++;
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void printIndex() {
        System.out.println("index:" + index);
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        for (int i = 0; i < 50; i++) {
            executor.execute(new MyRunnable());
        }
        executor.shutdown();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        singleton.printIndex();
    }
}
