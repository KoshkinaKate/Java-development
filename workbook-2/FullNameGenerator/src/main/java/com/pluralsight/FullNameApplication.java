package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String returnFirstName = firstName(myScanner);
        String returnMiddleName = middleName(myScanner);
        String returnLastName = lastName(myScanner);
        String returnSuffix = suffix(myScanner);

        callingName(returnFirstName, returnMiddleName, returnLastName, returnSuffix);

        String fullName = returnFirstName +" " + returnMiddleName + " " + returnLastName+ " " + returnSuffix;
        System.out.println("Full name: " + fullName);

    }

    public static void callingName(String firstName, String middleName, String lastName, String suffix) {
        System.out.println("First name : " + firstName);
        System.out.println("Middle name : " + middleName);
        System.out.println("Last name : " + lastName);
        System.out.println("Suffix : " + suffix);
    }

    public static String firstName(Scanner myScanner) {
        System.out.println("Please enter your first name : ");
        return myScanner.nextLine();
    }

    public static String middleName(Scanner myScanner) {
        System.out.println("Please enter your middle name : ");
        return myScanner.nextLine();
    }

    public static String lastName(Scanner myScanner) {
        System.out.println("Please enter your last name : ");
        return myScanner.nextLine();
    }

    public static String suffix(Scanner myScanner) {
        System.out.println("Please enter your suffix : ");
        return myScanner.nextLine();
    }

//    public static String commaForSuffix() {
//        if (suffix.toUpperCase().startsWith("P")) {
//            return ",";
//        } else {
//            return "";
//        }
//    }

    public static String trimLastName (String lastName){
        if (lastName.length() > 7) {
            return lastName.substring(0,7);
        } else{
            return lastName;
        }
    }

}
