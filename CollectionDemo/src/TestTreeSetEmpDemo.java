
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSetEmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet<Employee> empSet=new TreeSet<Employee>();
		
		Employee e1=new Employee(112621,"ffgdfg",748.45F);
	    Employee e2=new Employee(412621,"aaurva",54843.0F);
		Employee e3=new Employee(212621,"dfg",7555.45F);
	    Employee e4=new Employee(912621,"fgaaa",13433.0F);
	    Employee e5=new Employee(412621,"aaurva",54843.0F);
	    
	   empSet.add(e1);
	   empSet.add(e2);
	   empSet.add(e3);
	   empSet.add(e4);
	   empSet.add(e5);
	   
	   Iterator<Employee> itEmp=empSet.iterator();
	   while(itEmp.hasNext())
	   {
		   System.out.println("...."+itEmp.next());
	   }
	}

}
