package com.dp.structural.proxy;

public class BusinessServiceImpl implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("doProcessing method is running.");
    }
}
