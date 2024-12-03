package com.pluralsight.db;

import javax.sql.DataSource;
import java.sql.*;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertShipperData(String companyName, String phoneNumber) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO shippers (companyName, phone) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) { // names must be as in MySQL
            preparedStatement.setString(1, companyName);
            preparedStatement.setString(2, phoneNumber);

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows Inserted: " + rows);

            try(ResultSet keys = preparedStatement.getGeneratedKeys()){
                while (keys.next()){
                    System.out.println("Id: " + keys.getInt(1));
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void displayAllInformation (){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("""
                             SELECT *
                             FROM shippers
                             """
            ) ) {
            try(ResultSet results = preparedStatement.executeQuery()){
                while(results.next()){
                    int shipperId = results.getInt("shipperID");
                    String companyName = results.getString("companyName");
                    String phone = results.getString("phone");
                    System.out.println("Id: " + shipperId);
                    System.out.println("Company Name: " + companyName);
                    System.out.println("Phone Number: " + phone);
                    System.out.println("----------------------------------");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updatePhoneNumber(String newPhoneNumber, int shipperId){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE shippers SET phone = ? WHERE shipperID = ?")){
            preparedStatement.setString(1, newPhoneNumber);
            preparedStatement.setInt(2,shipperId);

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows Updated: " + rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteCompanyById(int shipperId){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM shippers WHERE shipperID = ? "
            )){
            preparedStatement.setInt(1,shipperId);

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows Deleted: " + rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

