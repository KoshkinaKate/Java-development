package com.pluralsight.main;

import com.pluralsight.db.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length !=2){
            System.out.println("User and Password are needed");
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];

        BasicDataSource nwDataSource = new BasicDataSource();
        nwDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        nwDataSource.setUsername(username);
        nwDataSource.setPassword(password);

        DataManager dataManager = new DataManager(nwDataSource);

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Insert New Shipper Information");
            System.out.println("2. Update Shipper's Phone Number");
            System.out.println("3. Delete Shipper's Information");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter a company name: ");
                    String companyName = scanner.nextLine();
                    System.out.println("Enter a company phone number: ");
                    String phoneNumber = scanner.nextLine();
                    dataManager.insertShipperData(companyName, phoneNumber);
                    dataManager.displayAllInformation();
                    break;
                case 2:
                    System.out.println("Enter ID of the company you want to update: ");
                    int shipperId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    dataManager.updatePhoneNumber(newPhoneNumber, shipperId);
                    dataManager.displayAllInformation();

                    break;
                case 3:
                    System.out.println("Enter ID to delete company from the system: ");
                    int shipperID = scanner.nextInt();
                    scanner.nextLine();
                    dataManager.deleteCompanyById(shipperID);
                    dataManager.displayAllInformation();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
