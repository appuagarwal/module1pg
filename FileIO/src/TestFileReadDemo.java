import java.io.*;
public class TestFileReadDemo
{
       public static void main(String[] args)
       {
    	   File myFile=new File("D://Apurva Agarwal\\FileIO\\src\\TestEmpReadDemo.java");
    	   FileInputStream fis=null;
    	   try
    	    {
			 fis=new FileInputStream(myFile);
			 int data=fis.read();            //reading byte by byte
			 while(data!=-1)
			 {
				 System.out.print((char)data);
				 data=fis.read();
			 }
		    } 
    	   catch (IOException e)
    	   {
			
			e.printStackTrace();
		}
       }
}
