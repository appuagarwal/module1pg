import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TestEmpWriteDemo 
{
	public static void main(String[] args)
	{
		FileOutputStream fos=null;
		//File file;
		DataOutputStream dos=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		int eid=sc.nextInt();
		System.out.println("Enter emp name:");
		String enm=sc.next();
		System.out.println("enter emp salary:");
		float esl=sc.nextFloat();
		try 
		{
			// file=new File("empInfo.txt");
			 fos=new FileOutputStream("empInfo.txt");
			 dos=new DataOutputStream(fos);
			 dos.writeInt(eid);
			 dos.writeBytes(enm);
			 dos.writeFloat(esl);
			 System.out.println("All info written in the file");
		} 
		catch(IOException e)
		{
			
			e.printStackTrace();
		}
	}
	
	
	
}
