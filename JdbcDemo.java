package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String DriverClass ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/javaBatch";
		String Username = "root";
		String password ="Syedali@13";
		
		String query = ""
				+ ""
				+ " ;";
		
		//load driver
		Class.forName(DriverClass);
		
		//obtain a connection
		Connection con = DriverManager.getConnection(url,Username,password);
		
		Statement st = con.createStatement();
		
		int count = st.executeUpdate(query);
		
		System.out.println("Number of row affected by this query="+count);
        
		//con.close();
		
		
		

	}

	
}
