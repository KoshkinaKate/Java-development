package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String customerName = myScanner.nextLine();

        System.out.println("What date will you be coming (MM/DD/YYYY): ");
        String customerDate = myScanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate convertedDate = LocalDate.parse(customerDate, formatter);

        System.out.println("How many tickets would you like: ");
        int numberOfTickets = Integer.parseInt(myScanner.nextLine());
        //or      int numberOfTickets = myScanner.nextInt();
        //        myScanner.nextLine();

        if ( customerName.equals("Geri Johnson") && convertedDate.equals(LocalDate.parse("2023-05-13"))) {
            String amountOfTickets = numberOfTickets == 1 ? "ticket" : "tickets"; // if 1- ticket else -tickets
            System.out.println(numberOfTickets + " " + amountOfTickets + " reserved for " + convertedDate + " under " + customerName);
        }
        myScanner.close();

        }
    }
