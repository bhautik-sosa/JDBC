import java.io.*;
import java.sql.*;


public class tut_4 {
    public static void main(String[] args) {
        
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name :");
            String v1 = br.readLine();
            System.out.println("Enter the city :");
            String v2 = br.readLine();

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into t1(name , city) values(?,?)";
            PreparedStatement prstmt = con.prepareStatement(q);

            prstmt.setString(1, v1);
            prstmt.setString(2, v2);

            prstmt.executeUpdate();
            System.out.println("Inserted Successfully !");
            prstmt.close();

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
