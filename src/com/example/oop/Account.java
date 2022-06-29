package com.example.oop;

public class Account {
    private String id;
    private String name;
    private double balance;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Methods
    public void credit(double amount)
    {
        this.balance += amount;
    }

    public boolean debit(double amount)
    {
        boolean isTrue;

        if (amount > this.balance)
        {
            System.out.println("Amount Exceeded");
            isTrue = false;
        }
        else {
            this.balance -= amount;
            isTrue = true;
        }
        return isTrue;
    }

    public void transferTo(Account another, double amount)
    {
        if (debit(amount))
        {
            another.balance += amount;
            System.out.println("Transfer Completed");
        }

    }

    public String accountDetails()
    {

        return name + ", the current balance in your account " + id + " is " + balance;

    }


    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
