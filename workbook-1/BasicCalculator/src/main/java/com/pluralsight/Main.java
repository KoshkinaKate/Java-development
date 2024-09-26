package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = myScanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = myScanner.nextDouble();
        myScanner.nextLine();


        System.out.println("Possible calculations: +, -, *, / ");
        System.out.println("Please enter your choice: ");
        String customerChoice = myScanner.nextLine();

        if (customerChoice.equals("+")){
            System.out.println("Result of addition is: " + (num1 + num2));
        }else if (customerChoice.equals("-")){
            System.out.println("Result of subtraction is: "+ (num1 - num2));
        } else if (customerChoice.equals("*")){
            System.out.println("Result of multiplication is: " + (num1 * num2));
        }else if (customerChoice.equals("/")){
            System.out.println("Result of division is: " + (num1 / num2));
        }
    }
}
