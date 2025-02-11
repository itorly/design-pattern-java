package com.dp.structural.facade;

import java.math.BigDecimal;

public class FundTransfer {
    public void transfer(String fromAccount, String toAccount, BigDecimal amount) {
        System.out.println("Transferring $" + amount.toString() + " from " + fromAccount + " to " + toAccount);
        // Simulate fund transfer logic
    }
}
