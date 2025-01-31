package com.dp.creational.abstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox.");
    }
}
