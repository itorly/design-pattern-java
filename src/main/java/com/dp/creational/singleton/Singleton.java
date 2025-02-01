package com.dp.creational.singleton;

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

    public void printIndex() {
        System.out.println("index:" + index);
    }

    public static void main(String[] args) {
        Singleton singleton = null;
        for (int i = 0; i < 10; i++) {
            singleton = Singleton.getInstance();
            singleton.printIndex();
        }

    }
}
