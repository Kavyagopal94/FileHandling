package com;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int eid;
	private String ename;
	private double esal;
	private transient String pswd;

	public Employee(int eid, String ename, double esal, String pswd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.pswd = pswd;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", pswd=" + pswd + "]";
	}

	
}
