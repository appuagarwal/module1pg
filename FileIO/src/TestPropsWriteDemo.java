import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropsWriteDemo {

	public static void main(String[] args)
	{
		FileOutputStream fos=null;
		Properties myDbInfo=null;
	  try 
	  {
		fos=new FileOutputStream("dbInfo.properties");
		myDbInfo=new Properties();
		myDbInfo.setProperty("dbUser", "System");
		myDbInfo.setProperty("dbPwd", "Root");
		myDbInfo.store(fos, "This is Dta Base Information");
		System.out.println("Data is written in the file");
	} 
	  catch (IOException e)
	  {
	
		e.printStackTrace();
	}

	}

}
