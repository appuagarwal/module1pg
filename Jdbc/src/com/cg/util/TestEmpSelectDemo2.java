package com.cg.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestEmpSelectDemo2 {

	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pst=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter min sal:");
		int minsal=sc.nextInt();
		System.out.println("Enter max sal:");
		int maxsal=sc.nextInt();
		String qry="SELECT * FROM emp_31 where empsal>=? and empsal<=?";//dynamic query
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:orcl11g","lab1btrg31","lab1boracle");
			pst=con.prepareStatement(qry);
			pst.setInt(1, minsal);
			pst.setInt(2, maxsal);
			rs=pst.executeQuery();
			while(rs.next())
			{
			System.out.println(":"+rs.getInt("empid")+":"+rs.getString("empname")+":"+rs.getInt("empsal"));
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
