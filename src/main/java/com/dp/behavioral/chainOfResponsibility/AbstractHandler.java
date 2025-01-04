package com.dp.behavioral.chainOfResponsibility;

public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     *
     * @param x
     * @return The return logic set in this example:
     * 1. Let the sequence number of the handler be i, where i = 1, 2, 3,... ,n
     * 2. When input x enters the i-th handler:
     *    2.1 If the "passing" condition is not met, return the current handler's index i.
     *    2.2 Otherwise:
     *       2.2.1 If i < n, enter the (i + 1)-th handler and return i + 1.
     *       2.2.2 If i = n, return i + 1. // x has passed all handlers.
     */
    public abstract int handle(int x);
}
