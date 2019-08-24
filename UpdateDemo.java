package com.quinnox.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.Scanner;
public class UpdateDemo {
	public static void main(String[] args){
		Connection con;
		PreparedStatement pstmt;
		int cnt=0;
		String sqlupdate;
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
		sqlupdate="update employees"+"set job_id=?"+"where employee_id=?";
		pstmt=con.prepareStatement(sqlupdate);
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee id");
		int eid=s.nextInt();
		s.nextLine();
		System.out.println("enter new job_id");
		String strm=s.nextLine();
		
		pstmt.setString(1, strm);
		pstmt.setInt(2, eid);
		
		int rowAffected =pstmt.executeUpdate();
		System.out.println("row affected "+rowAffected);
		
		strm="sales head";
		eid=1370;
		pstmt.setString(1, strm);
		pstmt.setInt(2, eid);
		
		rowAffected=pstmt.executeUpdate();
		System.out.println("row Affected"+rowAffected);
		con.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}
