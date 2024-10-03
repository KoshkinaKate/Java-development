package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone customer = new CellPhone();
        CellPhone customer2 = new CellPhone();

        Scanner myScanner = new Scanner(System.in);

        // Customer 1
        System.out.println("Enter details for the first cellphone:");

        System.out.println("What is the serial number? ");
        double serialNumberInput = myScanner.nextDouble();
        customer.setSerialNumber(serialNumberInput);
        myScanner.nextLine(); // Consume the leftover newline

        System.out.println("What model is the phone?");
        String modelInput = myScanner.nextLine();
        customer.setModel(modelInput);

        System.out.println("What is the carrier?");
        String carrierInput = myScanner.nextLine();
        customer.setCarrier(carrierInput);

        System.out.println("What is the phone number?");
        String phoneNumberInput = myScanner.nextLine();
        customer.setPhoneNumber(phoneNumberInput);

        System.out.println("What is the owner of the phone?");
        String ownerInput = myScanner.nextLine();
        customer.setOwner(ownerInput);

        // Customer 2
        System.out.println("Enter details for the second cellphone:");

        System.out.println("What is the serial number? ");
        double serialNumberInput2 = myScanner.nextDouble();
        customer2.setSerialNumber(serialNumberInput2);
        myScanner.nextLine(); // Consume the leftover newline

        System.out.println("What model is the phone?");
        String modelInput2 = myScanner.nextLine();
        customer2.setModel(modelInput2);

        System.out.println("What is the carrier?");
        String carrierInput2 = myScanner.nextLine();
        customer2.setCarrier(carrierInput2);

        System.out.println("What is the phone number?");
        String phoneNumberInput2 = myScanner.nextLine();
        customer2.setPhoneNumber(phoneNumberInput2);

        System.out.println("What is the owner of the phone?");
        String ownerInput2 = myScanner.nextLine();
        customer2.setOwner(ownerInput2);

        // Display properties of both phones
        display(customer);
        display(customer2);

        // Dial between the two phones
        customer.dial(customer2.getPhoneNumber());
        customer2.dial(customer.getPhoneNumber());

        myScanner.close();
    }

    // Static method to display phone properties
    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}

