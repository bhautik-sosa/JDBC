import java.sql.*;

public class tut_3 {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into t10(name,city) values (?,?)";  // --> Dynamic Query (As the values are unknown).

            // Get a PreparedStatement !

            PreparedStatement psmt = con.prepareStatement(q);

            // Set the values to query 

            psmt.setString(1,"raju depp");
            psmt.setString(2, "los Angles");

            psmt.executeUpdate();
            System.out.println("Successfully Inserted !");
            psmt.close();
            
        } catch (Exception e) {
           e.printStackTrace();
        }        
    }
}
