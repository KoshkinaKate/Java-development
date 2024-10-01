package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name below ");

//        if I want to use Scanner within main method:
//        System.out.print("Please enter first name: ");
//        String firstName= myScanner.nextLine().trim(); this line to store value

        String returnFirstName = firstName(myScanner); //creating a place where to store method from outside of Main function + calling this function
        String returnMiddleName = middleName(myScanner);
        String returnLastName = lastName(myScanner);
        String returnSuffix = suffix(myScanner);

        String fullName = returnFirstName; //initializing fullName variable with value from line 15- to create complete name

// Add middle name initial if provided
        if (!returnMiddleName.isEmpty()) { //check is Mid Name is NOT empty , extracts first letter , += - adding a new value to existing fullName
            fullName += " " + returnMiddleName.charAt(0) + ".";
        }

// Add the last name to already existed code before with first and middle name
        fullName += " " + returnLastName;

// Add the suffix if provided , checks if it is NOT empty
        if (!returnSuffix.isEmpty()) {
            fullName += ", " + returnSuffix;
        }

        System.out.println("Full name: " + fullName);

        myScanner.close();

    }

    public static String firstName(Scanner myScanner) {
        System.out.println("Please enter your first name : ");
        return myScanner.nextLine().trim();
    }

    public static String middleName(Scanner myScanner) {
        System.out.println("Please enter your middle name : ");
        return myScanner.nextLine().trim();
    }

    public static String lastName(Scanner myScanner) {
        System.out.println("Please enter your last name : ");
        return myScanner.nextLine().trim();
    }

    public static String suffix(Scanner myScanner) {
        System.out.println("Please enter your suffix : ");
        return myScanner.nextLine().trim();
    }



}
