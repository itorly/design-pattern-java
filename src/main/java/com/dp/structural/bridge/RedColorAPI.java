package com.dp.structural.bridge;

public class RedColorAPI implements ColorAPI {
    @Override
    public void paint() {
        System.out.println("Paint with red.");
    }
}
