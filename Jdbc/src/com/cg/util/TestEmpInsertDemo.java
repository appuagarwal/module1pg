package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestEmpInsertDemo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int empid=sc.nextInt();
		System.out.println("Enter employee name:");
		String empname=sc.next();
		System.out.println("Enter employee sal:");
		int empsal=sc.nextInt();
		String insertQry="INSERT INTO emp_31 VALUES(?,?,?)";
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:orcl11g","lab1btrg31","lab1boracle");
			pst=con.prepareStatement(insertQry);
			pst.setInt(1, empid);
			pst.setString(2, empname);
			pst.setInt(3, empsal);
			int noOfRecAffected=pst.executeUpdate();
			System.out.println(noOfRecAffected+" data is inserted in the table");
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
