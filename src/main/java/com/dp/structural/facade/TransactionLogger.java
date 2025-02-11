package com.dp.structural.facade;

import java.math.BigDecimal;

public class TransactionLogger {
    public void logTransaction(String fromAccount, String toAccount, BigDecimal amount) {
        System.out.println("Logging transaction: $" + amount.toString() + " transferred from " + fromAccount + " to " + toAccount);
        // Simulate logging logic
    }
}
