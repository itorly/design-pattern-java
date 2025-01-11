package com.dp.structural.proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        BusinessService target = new BusinessServiceImpl();

        BusinessService proxy = (BusinessService) java.lang.reflect.Proxy.newProxyInstance(
                BusinessService.class.getClassLoader(),
                new Class[] { BusinessService.class },
                new LoggingInvocationHandler(target)
        );

        proxy.doProcessing();
    }

}
