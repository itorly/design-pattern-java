package com.dp.behavioral.chainOfResponsibility;

import java.util.Random;

public class HandlerClient {
    public static void main(String[] args) {

        FirstHandler firstHandler = new FirstHandler();
        SecondHandler secondHandler = new SecondHandler();
        ThirdHandler thirdHandler = new ThirdHandler();

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);

        Random random = new Random();
        for ( int i=0; i<50; i++ ) {
            //  Generate a random integer between 0 and 99.
            int x = random.nextInt(101);
            System.out.println("x=" + x + " result=" + firstHandler.handle(x));
        }

    }
}
