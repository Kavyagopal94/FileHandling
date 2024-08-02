package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainClass 
{
	public static void main(String[] args) throws IOException 
	{
		Employee e1=new Employee(123,"Ram",45000.00,"Ram@123");
		Employee e2=new Employee(124,"Sham",35000.00,"Sham@124");
		Employee e3=new Employee(125,"Sam",25000.00,"Sam@125");
		Employee e4=new Employee(243,"Mohan",30000.00,"Mohan@243");
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(e1);l.add(e2);l.add(e3);l.add(e4);
		
		try {
			FileOutputStream f1=new FileOutputStream("emp.txt");
			ObjectOutputStream obj1=new ObjectOutputStream(f1);
			obj1.writeObject(l);
			f1.close();
			System.out.println("Serialization is done...!!!");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
