package com.pluralsight;

import java.sql.*;

public class main {
    public static void main(String[] args) throws SQLException {
        // load the MySQL Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

// 1. open a connection to the database
// use the database URL to point to the correct database
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "P@ssw0rd"
        );
// create statement
// the statement is tied to the open connection
        Statement statement = connection.createStatement();
// define your query
        String query = "SELECT ProductName FROM Products ";
// 2. Execute your query
        ResultSet results = statement.executeQuery(query);
// process the results
        while (results.next()) {
            String city = results.getString("ProductName");
            System.out.println(city);
        }
// 3. Close the connection
        connection.close();

    }
}
