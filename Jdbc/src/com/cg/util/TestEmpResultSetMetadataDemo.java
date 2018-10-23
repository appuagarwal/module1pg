package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestEmpResultSetMetadataDemo 
{
	public static void main(String[] args)
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:orcl11g","lab1btrg31","lab1boracle");
			st=con.createStatement();
			rs=st.executeQuery("SELECT * from emp_31");
			System.out.println("------Result Set Meta Data-------");
	        ResultSetMetaData rsmd=rs.getMetaData();
	        int colCount=rsmd.getColumnCount();
	        System.out.println("No. of column:"+colCount);
	        for(int i=1;i<=colCount;i++)
	        {
	        	System.out.println("column name:"+ rsmd.getColumnName(i)+"column data type:"+rsmd.getColumnTypeName(i));
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
