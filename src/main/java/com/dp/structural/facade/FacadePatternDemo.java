package com.dp.structural.facade;

import java.math.BigDecimal;

public class FacadePatternDemo {
    public static void main(String[] args)
    {
        BankingFacade facade = new BankingFacade();

        facade.transferFunds("123456", "987654", new BigDecimal(100));
    }
}
