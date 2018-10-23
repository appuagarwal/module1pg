import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestEmpSelectDemo 
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
			rs=st.executeQuery("SELECT * FROM emp_31");
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
