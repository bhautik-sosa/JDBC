import java.sql.*;

public class tut_7 {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";
            Connection con = DriverManager.getConnection(url, username, password);

            String q = "select * from t1";

            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(q);

            while(set.next()){

                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);

                System.out.println(" "+id+" :  "+name +" :  "+city );
                System.out.println();

            }

            System.out.println("Data has accessed !!");
            stmt.close();

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }    
}
