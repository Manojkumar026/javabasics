package com.basics;

public class Employee {
	String Firstname;
	 String Lastname;
	 double monthlysalary;
	 public String getFirstname(String a)
	 {
		 
	     Firstname="Firstname is"+a;
		 return Firstname;
	 }

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname(String b) {
		Lastname="Lastnameis"+b;
		return Lastname;
	}
	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	public double getMonthlysalary(double i) {
		if(i>0) {
			double salary=10*i;
			double sal=salary;
			double yearly=(salary/10)+sal;
			double yearlysalary=yearly;
			return yearlysalary;
		}
		else
		{
			return 0;
		}
	}
	public void setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	public static void main(String a[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		String f1=e1.getFirstname("Ajay");
		String s1=e1.getLastname("George");
		System.out.println(f1 + s1);
		String f2=e2.getFirstname("Shaggy");
		String s2=e2.getLastname("Bintu");
		
		
		System.out.println(f2 + s2);
		
		double m1=e1.getMonthlysalary(20000.0);
		double m2=e2.getMonthlysalary(30000.0);
		System.out.println(m1);
		System.out.println(m2);
		
	}
	}


