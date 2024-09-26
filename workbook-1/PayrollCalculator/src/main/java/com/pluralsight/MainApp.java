package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println( "Enter your first and last name: ");
        String name = myScanner.nextLine();

        System.out.println( "Enter hours you have worked: ");
        Float hours = myScanner.nextFloat();

        System.out.println("Enter your salary hourly: ");
        Float salary = myScanner.nextFloat();
        Float grossPay = hours * salary;

        System.out.printf("%s $%.2f", name, grossPay);




    }
}
