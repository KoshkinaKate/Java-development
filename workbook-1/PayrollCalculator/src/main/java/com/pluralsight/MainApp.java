package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    private static Object input;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first and last name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter hours you have worked: ");
        float hours = myScanner.nextFloat();

        System.out.println("Enter your salary hourly: ");
        float salary = myScanner.nextFloat();
        float grossPay = hours * salary;


        // Display the employee's name and gross pay
        System.out.printf("%s $%.2f", name, grossPay);

        myScanner.close(); //always close Scanner


    }
}
