package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: "); //user inputs first and last name
        String fullName = myScanner.nextLine().trim(); // deleting extra space

        String[] parserName = fullName.split(" ");

        if (parserName.length >= 2) { //checks if there are at least two elements
            String firstName = parserName[0]; //assigns first element to here - firstName
            String lastName = parserName[1];
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
        } else{
            System.out.println( "Invalid input");
        }

        myScanner.close();
    }
}

