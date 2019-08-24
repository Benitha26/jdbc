package com.quinnox.jdbc;

import java.sql.*;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		//@SuppressWarnings("unused")
		//ResultSet rs;
		int cnt=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
			String sql="Delete from officers where city='Noida';";
			System.out.println("");
			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql);
			if(cnt>0)
			{
				System.out.println("record deleted");
			}
			con.close();
			
		}
		catch(Exception ce){
			System.out.println(ce);
		}
	}
}
