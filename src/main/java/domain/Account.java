package domain;

import java.time.LocalDate;

public class Account {
    private long accountId;
    private String accountNumber;
    private String accountType;
    private LocalDate dateOpened;
    private double balance;
    private Customer customer;

    public Account(long accountId, String accountNumber, String accountType,
                   LocalDate dateOpened, double balance, Customer customer) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.dateOpened = dateOpened;
        this.balance = balance;
        this.customer = customer;
    }

    public long getAccountId() { return accountId; }
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public LocalDate getDateOpened() { return dateOpened; }
    public double getBalance() { return balance; }
    public Customer getCustomerId() { return customer; }
}