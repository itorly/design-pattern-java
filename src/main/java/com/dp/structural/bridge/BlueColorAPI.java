package com.dp.structural.bridge;

public class BlueColorAPI implements ColorAPI {
    @Override
    public void paint() {
        System.out.println("Paint with blue.");
    }
}
