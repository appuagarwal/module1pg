package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestEmpDeleteDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id u want to delete:");
		int empid=sc.nextInt();
		String insertQry="DELETE FROM emp_31 where empid=?";
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:orcl11g","lab1btrg31","lab1boracle");
			pst=con.prepareStatement(insertQry);
			pst.setInt(1, empid);
			pst.executeQuery();
			System.out.println(" data is deleted from the table");
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
