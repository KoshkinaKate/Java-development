package com.pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods


    public void withdraw(double amount){
        System.out.println("withdrawing...");
    }

    public void deposit (double amount){
        System.out.println("depositing..");
    }

    public double getValue(){
        return balance;
    }


}

