package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestEmpUpdateDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id you want to update");
		int id=sc.nextInt();
		System.out.println("Enter updated employee name:");
		String name=sc.next();
		System.out.println("Enter updated salary");
		int sal=sc.nextInt();
		String insertQry="UPDATE emp_31 SET empname=?,empsal=? WHERE empid=?";
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:orcl11g","lab1btrg31","lab1boracle");
			pst=con.prepareStatement(insertQry);
			pst.setString(1, name);
			pst.setInt(2, sal);
			pst.setInt(3, id);
			pst.executeUpdate();
			System.out.println(" data is updated in the table");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
