import java.io.*;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class tut_5 {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_pr_1";
            String username = "root";
            String password = "Sosa@2004";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into images(pic) values(?)";
            PreparedStatement prstmt = con.prepareStatement(q);

            JFileChooser jfc = new JFileChooser();

            jfc.showOpenDialog(null);

            File file = jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            prstmt.setBinaryStream(1, fis, fis.available());

            prstmt.executeUpdate();

            
            JOptionPane.showMessageDialog(null,"Success");
            
            System.out.println(" Image Successfully Inserted !!!");

            prstmt.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }   
}
