import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListEmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		Employee e1=new Employee(112621,"ffgdfg",748.45F);
	    Employee e2=new Employee(412621,"aaurva",54843.0F);
		Employee e3=new Employee(212621,"dfg",7555.45F);
	    Employee e4=new Employee(912621,"fgaaa",13433.0F);
	    
	   empList.add(e1);
	   empList.add(e2);
	   empList.add(e3);
	   empList.add(e4);
	   
	   Iterator<Employee> itEmp=empList.iterator();
	   while(itEmp.hasNext())
	   {
		   System.out.println("...."+itEmp.next());
	   }
	}

}
