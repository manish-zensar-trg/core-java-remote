package day8.jdbc;

import java.sql.*;

// Demo of JDBC Connection
public class Example1 {

	public static void main(String[] args) {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root";
		try {
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
		System.out.println("Connection: "+con);
		
		String sql = "select * from login";
		// Statement or PreparedStatement
		// First giving demo using Statement
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql); // for select queries, we use executeQury() method
		while(rs.next()) {
			String userName = rs.getString("user_name");
			String password = rs.getString("password");
			System.out.println("userName:"+userName);
			System.out.println("password:"+password);
			System.out.println("**************************");
		}
		
		
		}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
		}
		
		
	}
}
