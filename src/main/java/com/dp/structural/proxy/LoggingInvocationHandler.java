package com.dp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method " + method.getName() + " is invoked with args: " + java.util.Arrays.toString(args));
        Object result = method.invoke(target, args);
        System.out.println("Method " + method.getName() + " execution completed.");
        return result;
    }
}
