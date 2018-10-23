package com.cg.ems.dao;
import java.sql.*;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.util.DBUtil;

public class EmpDaoImpl implements EmpDao
{
	Logger daoLogger=null;
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	public EmpDaoImpl()
	{
		daoLogger=Logger.getLogger(EmpDaoImpl.class);
		PropertyConfigurator.configure("resources/log4j.properties");
	}
	@Override
	public ArrayList<Employee> getAllEmp() throws EmployeeException
	{
		ArrayList<Employee> empList=null;
		try
		{
			empList=new ArrayList<Employee>();
			con=DBUtil.getConn();
			System.out.println("**********Welcome to EMS*************");
			String selectqry="SELECT * FROM emp_31";
			st=con.createStatement();
			rs=st.executeQuery(selectqry);
			while(rs.next())
			{
				empList.add(new Employee(rs.getInt("empId"),rs.getString("empName"),rs.getFloat("empSal")));
			}
		}
		catch(Exception e)
		{
			throw new EmployeeException(e.getMessage());
		}
		finally
		{
			try
			{
				st.close();
				rs.close();
				con.close();
			}
			catch(SQLException e)
			{
				daoLogger.error(e.getMessage());
				throw new EmployeeException(e.getMessage());
			}
		}
		daoLogger.info("All data retrieved:"+empList);
		return empList;
	}

	@Override
	public  int addEmp(Employee ee) throws EmployeeException 
	{
		
		try
		{
			con=DBUtil.getConn();
			String insertqry="INSERT INTO emp_31 VALUES(?,?,?)";
			pst=con.prepareStatement(insertqry);
			pst.setInt(1,ee.getEmpId());
			pst.setString(2,ee.getEmpName());
			pst.setFloat(3,ee.getEmpSal());
		   int	data=pst.executeUpdate();
		    return data;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
	}

}
