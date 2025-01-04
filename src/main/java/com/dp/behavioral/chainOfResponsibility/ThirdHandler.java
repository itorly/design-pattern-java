package com.dp.behavioral.chainOfResponsibility;

public class ThirdHandler extends AbstractHandler {

    private int getData() {
        return 90;
    }

    private int level = 3;

    @Override
    public int handle(int x) {

        int data = getData();

        if (x >= data) {
            if ( null != this.nextHandler ) {
                this.nextHandler.handle(x);
            } else {
                return level + 1;
            }
        }

        return level;
    }
}
