package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //input from the user
        System.out.println("Please enter a book you would like to read: \n");
        String fileName = myScanner.nextLine().toLowerCase(); //user’s input is captured

        try {
            FileInputStream fis = new FileInputStream(fileName); //open the file specified by the user
            Scanner fileScanner = new Scanner(fis); //created to read the content of the file specified in fileName
            int lineNumber = 1; //This will be used to print the line numbers next to each line of the file content starting with 1
            while (fileScanner.hasNextLine()){ //keeps running as long as the file has more lines to read
                String line = fileScanner.nextLine();
                System.out.printf("%d. %s%n", lineNumber, line); //prints the current lineNumber and the content of the current line ' %d -integer, %s- string, %n-new line
                lineNumber ++; //this increments the lineNumber variable by 1
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + fileName);
        }

    }
}

