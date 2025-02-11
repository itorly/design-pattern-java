package com.dp.structural.facade;

import java.math.BigDecimal;

public class BankingFacade {
    private AccountValidator accountValidator;
    private FundTransfer fundTransfer;
    private TransactionLogger transactionLogger;

    public BankingFacade() {
        this.accountValidator = new AccountValidator();
        this.fundTransfer = new FundTransfer();
        this.transactionLogger = new TransactionLogger();
    }

    public void transferFunds(String fromAccount, String toAccount, BigDecimal amount) {
        if ( ! accountValidator.validateAccount(fromAccount) ) {
            System.out.println("Invalid sender account: " + fromAccount);
            return;
        }

        if ( ! accountValidator.validateAccount(toAccount) ) {
            System.out.println("Invalid recipient account: " + toAccount);
            return;
        }

        fundTransfer.transfer(fromAccount, toAccount, amount);
        transactionLogger.logTransaction(fromAccount, toAccount, amount);
        System.out.println("Transaction completed successfully!");

    }

}
