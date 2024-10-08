package com.pluralsight;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String[] famousQuotes = {
                "Believe in yourself.",
                "Stay positive.",
                "Never give up.",
                "Dream big.",
                "Work hard.",
                "Keep moving forward.",
                "Embrace challenges.",
                "Be kind.",
                "Stay focused.",
                "Make it happen."
        };
        System.out.println("Please pick the quote that you like the most");
        try {

            for (int i = 0; i < famousQuotes.length; i++) { // .length the total number of quotes in the array
                System.out.println((i + 1) + ". " + famousQuotes[i]);
            }
            int choice = myScanner.nextInt();
            System.out.println("You have selected: " + famousQuotes[choice - 1]);//subtracting 1 converts it to the correct index in the array

            myScanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}

