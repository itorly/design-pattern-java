package com.dp.structural.bridge;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rectangle.");
        colorAPI.paint();
    }
}
