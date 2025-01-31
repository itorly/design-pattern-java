package com.dp.creational.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button.");
    }
}
