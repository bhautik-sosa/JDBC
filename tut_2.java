import java.sql.*;

public class tut_2 {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";
            Connection con = DriverManager.getConnection(url, username, password);

            // Create query and run it 

            String q = "create table t10(id int(10) primary key auto_increment , name varchar(15) not null , city varchar(10) )";

            // Get the Statement
            
            Statement stmt =  con.createStatement();

            stmt.executeUpdate(q);
            System.out.println("\nTable created successfully");

            stmt.close();
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}