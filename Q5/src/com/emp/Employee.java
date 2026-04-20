package com.emp;
public class Employee {
		private int id;
		private String name;
		private double sal;
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
			
		}
		public double getSal()
		{
			return sal;
			
		}
		public void setid (int id) {
			this.id=id;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		public void setsal(double sal)
		
		{ 
			if(sal>0) 
			{
			this.sal=sal;
		
		}
		else 
		{
			System.out.println("invalid");
			
		}
		}
		
	}


