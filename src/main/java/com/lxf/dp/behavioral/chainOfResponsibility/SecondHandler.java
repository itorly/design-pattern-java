package com.lxf.dp.behavioral.chainOfResponsibility;

public class SecondHandler extends AbstractHandler {

    private int getData() {
        return 75;
    }

    int level = 2;
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
