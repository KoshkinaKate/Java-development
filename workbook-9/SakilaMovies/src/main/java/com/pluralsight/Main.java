package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("This application needs a Username and Password to run!!");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter last name of an actor: ");
            String lastNameToSearch = scanner.nextLine();

            lastNameSearch(dataSource, lastNameToSearch);
            System.out.println("==========================");

            System.out.println("Please enter first name of an actor: ");
            String firstNameToSearch = scanner.nextLine();
            System.out.println("Please enter last name of an actor: ");
            String lastNameToSearch2 = scanner.nextLine();
            moviesByLastName (dataSource, firstNameToSearch, lastNameToSearch2);




        }catch(Exception ex){
            System.out.println("An error has occurred");
            ex.printStackTrace();

        }
    }
    public static void lastNameSearch(DataSource dataSource, String lastNameToSearch){
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
                """
                             SELECT first_name, last_name
                             FROM actor
                             WHERE last_name LIKE ?
                             ORDER BY first_name;
                             """
        )) {
            preparedStatement.setString(1, lastNameToSearch);
            try(ResultSet results = preparedStatement.executeQuery()){
                while (results.next()){
                    String lastName = results.getString("last_name");

                    System.out.println("Last Name is " + lastName);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    public static void moviesByLastName(DataSource dataSource, String firstNameToSearch, String lastNameToSearch ){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    """
                            SELECT title\s
                            FROM actor a
                            WHERE last_name LIKE ? AND first_name LIKE ?
                            JOIN film_actor fa ON a.actor_id = fa.actor_id
                            JOIN film f ON fa.film_id = f.film_id
                                 """
            )) {
            preparedStatement.setString(1, lastNameToSearch);
            try(ResultSet results = preparedStatement.executeQuery()){
                while (results.next()){
                    String lastName = results.getString("last_name");

                    System.out.println("Last Name is " + lastName);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}