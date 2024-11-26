package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/northwind";
    private String username;
    private String password;

    public DBHelper(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void displayAllProducts(){
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
    };
    public void displayAllCustomers(){};


}
