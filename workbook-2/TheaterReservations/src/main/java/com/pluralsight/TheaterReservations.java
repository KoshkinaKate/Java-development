package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String [] customerName = myScanner.nextLine().trim().split(" ");

        System.out.println("What date will you be coming (MM/DD/YYYY): ");
        String customerDate = myScanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate convertedDate = LocalDate.parse(customerDate, formatter);

        System.out.println("How many tickets would you like: ");
        int numberOfTickets = Integer.parseInt(myScanner.nextLine());
        //or      int numberOfTickets = myScanner.nextInt();
        //        myScanner.nextLine();

        if ( numberOfTickets > 1 ) {
            System.out.println( numberOfTickets + " tickets reserved for " + convertedDate + " under " + customerName [1] + ", " + customerName[0]);
            }else{
            System.out.println( "1 ticket reserved for " + convertedDate + " under " + customerName [1] + ", " + customerName[0]);

        }
        myScanner.close();

        }
    }
