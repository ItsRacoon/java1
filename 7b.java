import java.sql.*;

public class RetrieveDetails 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Student?useSSL=false&serverTimezone=UTC", 
                "root", 
                "system"
            );

            // Create a statement to execute SQL queries
            Statement stmt = con.createStatement();

            // Execute a query and store the results in a ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Iterate through the ResultSet and print each row
            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Close the connection
            con.close();
        } 
        catch(Exception e) 
        { 
            // Print any exceptions that occur
            System.out.println(e);
        } 
    } 
}
