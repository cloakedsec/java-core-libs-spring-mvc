package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbManager {
		public Connection getConnection() {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wp_amd", "root", "");
			return con;
			}
			catch(ClassNotFoundException e){
				
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			}
		}
}
