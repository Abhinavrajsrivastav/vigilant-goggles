package Advanced_j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBCExample {

    // Database credentials and URL (replace with your own)
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_name";
    static final String USER = "your_username";
    static final String PASS = "your_password";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // STEP 1: Register the JDBC driver. This is often not needed for modern JDBC 4.0 drivers.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // STEP 2: Open a connection to the database.
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Create a Statement to execute a query.
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT id, name, age FROM employees";
            
            // STEP 4: Execute the query and get the result set.
            rs = stmt.executeQuery(sql);

            // STEP 5: Process the result set.
            System.out.println("Fetching data...");
            while (rs.next()) {
                // Retrieve by column name or index
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                // Display results
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // STEP 6: Close resources in a finally block.
            try {
                if (rs != null) rs.close();
            } catch (SQLException se2) {
            }
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}