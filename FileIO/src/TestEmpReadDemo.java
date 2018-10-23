import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEmpReadDemo {

	public static void main(String[] args)
	{
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter Emp id:");
			int eid=Integer.parseInt(br.readLine());
			System.out.println("Enter emp name:");
			String ename=br.readLine();
			System.out.println("Enter emp salary:");
			float esal=Float.parseFloat(br.readLine());
			System.out.println(eid+":"+ename+":"+esal);
		} 
		
		 catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

}
