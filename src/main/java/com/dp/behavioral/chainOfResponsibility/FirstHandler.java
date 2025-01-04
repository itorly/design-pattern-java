package com.dp.behavioral.chainOfResponsibility;

public class FirstHandler extends AbstractHandler {

    private int getData() {
        return 60;
    }

    private int level = 1;

    @Override
    public int handle(int x) {
        int data = getData();
        if (x >= data) {
            if ( null != this.nextHandler ) {
                return this.nextHandler.handle(x);
            }
        }
        return level;
    }
}
