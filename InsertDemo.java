package com.quinnox.jdbc;
import java.sql.*;
public class InsertDemo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employees");
		String str ="insert into departmentS values (310,'sports',204,2500)";
		stmt=con.createStatement();
		int rowcount=stmt.executeUpdate(str);
		if(rowcount>0)
		{
			System.out.println("record inserted succefully");
		}
	
		
		String str1="Select count(location_id) from locations";
		rs=stmt.executeQuery(str1);
		while(rs.next())
		{
			cnt=rs.getInt(1);
			
		}
		System.out.println("total no of records is "+cnt);
		con.close();
}
	catch(Exception ce){
		System.out.println(ce);
	}
}
}