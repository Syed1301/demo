package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementdemo {

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		String DriverClass ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/javaBatch";
		String Username = "root";
		String password ="Syedali@13";
	try {
		Class.forName(DriverClass);
		
		Connection con = DriverManager.getConnection(url,Username,password);
		
		CallableStatement call = con.prepareCall("{call getnew()}");
		
		ResultSet re = call.executeQuery();
		
		while(re.next()) {
			System.out.println(" ID: "+re.getInt(1)+","+
		    " Name: "+re.getString(2)+","+" Desigation: "+re.getString(3)+","+" Age: "+re.getInt(4));
		}
		
	}catch(SQLException e) {
		System.out.println(e);
	}
	
	}

}
