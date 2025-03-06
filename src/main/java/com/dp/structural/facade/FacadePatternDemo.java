package com.dp.structural.facade;

import java.math.BigDecimal;

/**
 * The Facade pattern provides a simple, unified interface for a complex subsystem.
 */
public class FacadePatternDemo {
    public static void main(String[] args)
    {
        BankingFacade facade = new BankingFacade();

        facade.transferFunds("123456", "987654", new BigDecimal(100));
    }
}
