import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class tut_6 {
    public static void main(String[] args) {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";
            Connection con = DriverManager.getConnection(url, username, password);

            String q = "update t1 set name = ?, city = ? where id = ?";

            PreparedStatement prstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the new name :");
            String v1 = br.readLine();

            System.out.println("Enter the new city :");
            String v2 = br.readLine();

            System.out.println("Enter the student id :");
            int v3 = Integer.parseInt(br.readLine());

            prstmt.setString(1, v1);
            prstmt.setString(2, v2);
            prstmt.setInt(3, v3);

            prstmt.executeUpdate();

            System.out.println("Successfully updated !!");

            prstmt.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
