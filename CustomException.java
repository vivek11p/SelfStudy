package com.javabrains;

public class CustomException extends Throwable{
	
	public CustomException(String msg)
	{
		super(msg);
	}

	public CustomException(String msg,Throwable cause)
	{
		super(msg,cause);
	}
}
