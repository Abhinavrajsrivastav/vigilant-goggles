package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/database";
        // Database credentials
        String user = "username";
        String password = "password";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected!");

            // Create a statement object to perform a query
            statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM yourtable"; // Change "yourtable" to your table name
            resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1")); // Change "column1" to your column name
                System.out.println("Column2: " + resultSet.getString("column2")); // Change "column2" to your column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
