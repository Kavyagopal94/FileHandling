package com;

public class Database
{
	public static Database obj;
	
	private Database() 
	{
		
	}
	
	public static Database getInstance()
	{
		if(obj==null)
		{
			obj=new Database();
		}
		return obj;
	}
	
	public void Connection()
	{
		System.out.println("Connected to Database");
	}

}
