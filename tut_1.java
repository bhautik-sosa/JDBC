import java.sql.*;

class tut_1{
	public static void main(String[] args) {
		try {
			// Load the driver !
			Class.forName("com.mysql.jdbc.Driver");

			// Creating a connection :

			String url = "jdbc:mysql://localhost:3306/jdbc_pr_1" ;
			String username = "root";
			String password = "Sosa@2004";
			Connection con = DriverManager.getConnection(url, username, password );

			if(con.isClosed()){
				System.out.println("Connection not created");
			}else{
				System.out.println("Successfully connection created !");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}