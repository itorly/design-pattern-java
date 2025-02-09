package com.dp.structural.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle();
        redCircle.setColorAPI(new RedColorAPI());
        redCircle.draw();

        Shape blueRectangle = new Rectangle();
        blueRectangle.setColorAPI(new BlueColorAPI());
        blueRectangle.draw();
    }
}
