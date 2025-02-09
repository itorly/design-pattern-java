package com.dp.structural.bridge;

public abstract class Shape {
    protected ColorAPI colorAPI;

    public void setColorAPI(ColorAPI colorAPI) {
        this.colorAPI = colorAPI;
    }

    public abstract void draw();
}
