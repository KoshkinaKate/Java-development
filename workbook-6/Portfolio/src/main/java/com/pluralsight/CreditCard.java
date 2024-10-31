package com.pluralsight;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods

    public void charge(double amount){
        System.out.println("");
    }

    public void pay(double amount){

    }

    public double getValue(){
        return balance;
    }
}
