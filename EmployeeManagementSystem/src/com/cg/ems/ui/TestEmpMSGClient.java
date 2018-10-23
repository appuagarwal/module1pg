package com.cg.ems.ui;
import java.util.ArrayList;
import java.util.Scanner;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmpService;
import com.cg.ems.service.EmpServiceImpl;
public class TestEmpMSGClient
{
	static EmpService empService=null;
	static Scanner sc=null;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		empService=new EmpServiceImpl();
		System.out.println("********Welcome to EMS*********");
		int choice=0;
		while(true)
		{
			System.out.println("What do u want to do?");
			System.out.println("\t 1:Add Emp\t 2:Show all Emp\n"+"\t 3:Update EMP \t 4:Delete Emp \t\n"+"\t 5:Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:insertEmp();break;
			case 2:dispALLemp();break;
			default:System.out.println("******Thank You******");System.exit(0);
			}
		}
	}
	private static void dispALLemp()
	{
		ArrayList<Employee> empList;
		try {
			empList=empService.getAllEmp();
			System.out.println("\tEMPID \tEMPNAME \tEMPSAL");
			for(Employee ee:empList)
			{
				System.out.println("\t"+ee.getEmpId()+"\t"+ee.getEmpName()+"\t"+ee.getEmpSal());
			}
		}
		catch (EmployeeException e) 
		{
			e.printStackTrace();
		}
	}
	private static void insertEmp() 
	{
		try {
			System.out.println("Enter ur Emp ID");
			int eId=sc.nextInt();
			System.out.println("Enter Name");
			String enm=sc.next();
			float esl=0.0F;
			if(empService.validateEmpName(enm))
			{
				System.out.println("Enter salary");
				esl=sc.nextFloat();
				Employee e1=new Employee(eId,enm,esl);
				int dataInserted=empService.addEmp(e1);
				if(dataInserted==1)
				{
					dispALLemp();
				}
				else
				{
					System.out.println("Sorry data is"+"not inserted");
				}
			}
		}
		catch (EmployeeException e)
		{
			e.printStackTrace();
		}
	}
}
