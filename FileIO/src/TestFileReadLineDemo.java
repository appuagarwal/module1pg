import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReadLineDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	   File myFile=new File("D://Apurva Agarwal\\FileIO\\src\\TestEmpReadDemo.java");
 	   FileReader fr=null;
 	   FileWriter fw=null;
 	   BufferedReader br=null;
 	   BufferedWriter bw=null;
 	   try
 	    {
			 fr=new FileReader(myFile);
			 br=new BufferedReader(fr);
			 fw=new FileWriter("MyFile.txt");
			 bw=new BufferedWriter(fw);
			 String line=br.readLine();
			 while(line!=null)
			 {
				 System.out.print(line);
				 bw.write(line);
				 bw.flush();
				 line=br.readLine();
			 }
			 System.out.print("all data written in the file");
		    } 
 	   catch (IOException e)
 	   {
			
			e.printStackTrace();
		}
    }
}
