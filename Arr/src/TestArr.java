import java.util.Scanner;

public class TestArr {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		    int marks[]=new int[3];
		     marks[0]=99;
		     marks[1]=90;
		     marks[2]=80;
		     for(int i=0;i<marks.length;i++)
		     {
		    	 System.out.println(marks[i]);
		     }
            Scanner sc=new Scanner(System.in);
            System.out.println("How many employee do u want");
            int empCount=sc.nextInt();
		    Employee emps[]=new Employee[empCount];
		    for(int i=0;i<emps.length;i++)
		    {
		    	System.out.println("enter empid");
		    	int eId=sc.nextInt();
		    	System.out.println("enter employee name");
		    	String eName=sc.next();
		    	System.out.println("enter employee salary");
		    	float eSal=sc.nextFloat();
		    	emps[i]=new Employee(eId,eName,eSal);
		    }
		    for(Employee tempEmp:emps)
		    {
		    	System.out.println(tempEmp);
		    }
		    
	}

}
