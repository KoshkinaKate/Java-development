package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.println("Full name: ");
        String fullName = myScanner.nextLine().trim();

        System.out.println("Billing Street: ");
        String billingStreet = myScanner.nextLine().trim();

        System.out.println("Billing City: ");
        String billingCity = myScanner.nextLine().trim();

        System.out.println("Billing State: ");
        String billingState = myScanner.nextLine().trim();

        System.out.println("Billing Zip: ");
        String billingZip = myScanner.nextLine().trim();

        System.out.println("Shipping Street: ");
        String shippingStreet = myScanner.nextLine().trim();

        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine().trim();

        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine().trim();

        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine().trim();

        StringBuilder customerInfo = new StringBuilder();

        customerInfo.append(fullName).append("\n\n");
        customerInfo.append("Billing Address:\n");
        customerInfo.append(billingStreet).append("\n");
        customerInfo.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n\n");
        customerInfo.append("Shipping Address:\n");
        customerInfo.append(shippingStreet).append("\n");
        customerInfo.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        String stringBuilderResult = customerInfo.toString();
        System.out.println(stringBuilderResult);






    }

}
