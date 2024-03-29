package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DriverClass ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/javaBatch";
		String Username = "root";
		String password ="Syedali@13";
		try {
			Class.forName(DriverClass);
			
			Connection con = DriverManager.getConnection(url,Username,password);
			
			Statement stm = con.createStatement();
			String sql = "insert into student (8,'Syedali','java+'); ";
			
			int b = stm.executeUpdate(sql);
			
			System.out.println("Succes");
			System.out.println("row"+b);
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
