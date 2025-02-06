package com.dp.creational.singleton.thread_safe;

import org.springframework.http.converter.json.GsonBuilderUtils;

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

    public int getIndex() {
        return index;
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

        for (int i = 0; i < 10000000; i++) {
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
