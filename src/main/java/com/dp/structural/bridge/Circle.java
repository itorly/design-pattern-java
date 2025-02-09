package com.dp.structural.bridge;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a circle.");
        colorAPI.paint();
    }
}
