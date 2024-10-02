package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone customer = new CellPhone();
        Scanner myScanner = new Scanner(System.in);

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
        customer.setOwner(ownerInput); // Use the setters to assign the values entered by the user

        // Use the getters to print the properties
        System.out.println("Serial Number: " + customer.getSerialNumber());
        System.out.println("Model: " + customer.getModel());
        System.out.println("Carrier: " + customer.getCarrier());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Owner: " + customer.getOwner());

        myScanner.close();
    }

}
