package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int customerAge = myScanner.nextInt();
        myScanner.nextLine();  // Consume the leftover newline

        System.out.println("Please pick the size 1: Regular - $5.45 2: Large - $8.95");
        System.out.println("Enter your choice:");
        int customerChoice = myScanner.nextInt();

        double price = (customerChoice == 1) ? 5.45 : 8.95; //updated if/else statement

//        double price;
//        if (customerChoice == 1) {
//            price = 5.45; // Regular size
//        } else if (customerChoice == 2) {
//            price = 8.95; // Large size
//        } else {
//            System.out.println("Invalid choice. Defaulting to Regular size.");
//            price = 5.45;
//        }

        double finalPrice = calculateDiscount(customerAge, price);
        System.out.println("Final price is " + finalPrice); //calling the final price to display
    }

    public static double calculateDiscount(double age, double price) {
        if (age <= 17) {
            return price * 0.90;  // 10% discount
        } else if (age >= 65) {
            return price * 0.80;  // 20% discount
        } else {
            return price;
        }

    }

}



