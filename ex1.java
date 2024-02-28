import java.sql.*;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String v1 = sc.nextLine();
            String v2 = sc.nextLine();

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into t1(name,city) values (?,?)";

            // Get a PreparedStatement !

            PreparedStatement psmt = con.prepareStatement(q);

            // Set the values to query 

            
            psmt.setString(1, v1);
            psmt.setString(2, v2);

            psmt.executeUpdate();
            System.out.println("Successfully Inserted !");
            psmt.close();
            
        } catch (Exception e) {
           System.out.println(e);
        }        
    }
}