package com.pluralsight;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final DBHelper dbHelper;

    public Menu(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public void displayHomeScreen() {
        while (true) {
            System.out.println("Please select an option: ");
            System.out.println("1. Display all products");
            System.out.println("2. Display all customers");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> dbHelper.displayAllProducts();
                case 2 -> dbHelper.displayAllCustomers();
                case 0 -> {
                    System.out.println("Exiting application. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
