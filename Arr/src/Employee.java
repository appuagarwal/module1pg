
public class Employee implements Comparable<Employee>
{

	int empID;
	String empName;
	float empSal;
	public Employee() 
	{
		// TODO Auto-generated constructor stub
		
	}
	
	public String toString()
	{
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	public Employee(int empID, String empName, float empSal) 
	{
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee ee=(Employee)obj;
		if(this.empID == ee.empID)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode()
	{
		return empID;
	}
	@Override
	public int compareTo(Employee ee)
	{
		if(this.empID<ee.empID)
		{
			return -1;
		}
		else if(this.empID==ee.empID)
		{
			return 0;
		}
		else
		{
			return +1;
		}
	}
}
