package com.cg.ems.exception;
public class EmployeeException extends Exception
{
	String msg;
	public EmployeeException(String msg)
	{
		super(msg);
	}
	public EmployeeException(String msg,Throwable cause,ErrorCode code)
	{
		super(msg,cause);
	}
}
