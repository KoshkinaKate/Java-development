package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        //declaring username + password in config
        try {
            if (args.length != 2){
                System.out.println("The application must have username and password to run");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password
        );

        String query = """
                SELECT ProductID as ID,
                ProductName as Name, 
                UnitPrice as Price, 
                UnitsInStock as Stock
                FROM Products;
                """;
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet results = preparedStatement.executeQuery();

            // Print header row, formatted
            System.out.printf("%-10s %-40s %-15s %-10s%n", "ID", "Name", "Price", "Stock");
            System.out.println("--------------------------------------------------------------------------");

            while (results.next()) {
                int id = results.getInt("ID");
                String name = results.getString("Name");
                double price = results.getDouble("Price");
                int stock = results.getInt("Stock");

                // Print each row of data
                System.out.printf("%-10s %-40s %-15s %-10s%n", id, name, price, stock);
            }

            results.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("An error has occurred");
            ex.printStackTrace();
        }
    }
}
