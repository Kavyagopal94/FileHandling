package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainClassD
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		try {
	        FileInputStream f1 = new FileInputStream("emp.txt");
	        ObjectInputStream obj1=new ObjectInputStream(f1);
	        ArrayList<Employee> l=(ArrayList<Employee>)obj1.readObject();
	        
	        for(Employee e:l)
	        {
	        	System.out.println(e);
	        }
	        
	        obj1.close();
	        f1.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}





