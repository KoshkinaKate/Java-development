package com.pluralsight;

import java.io.*;

public class main {
    public static void main(String[] args) {
        String fileName = "employees.csv"; //the program will read this file

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)); //read the file line by line
            String line; //store each line of the file as it is read

            while((line = bufferedReader.readLine()) != null){ //if it is NOT null - continues
                String [] tokens = line.split("\\|"); //split method by |
                int id = Integer.parseInt(tokens[0]); //converted from a string to an integer
                String name = tokens[1]; //split line (tokens[1]) is assigned to the name variable
                double hoursWorked = Double.parseDouble(tokens[2]); // third part of the split line (tokens[2]) is converted to a double
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate); // object with usage of constructor

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

            }
           





            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error has occurred");
        }
    }
}
