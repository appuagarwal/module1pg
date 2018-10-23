import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestEmpSerializationDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		int eid=sc.nextInt();
		System.out.println("Enter emp name:");
		String enm=sc.next();
		System.out.println("enter emp salary:");
		float esl=sc.nextFloat();
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		Employee e1=new Employee(eid,enm,esl);
		try 
		{
			fos=new FileOutputStream("EmpObjs.obj");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			System.out.println("Employee e1 is written in the file");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
