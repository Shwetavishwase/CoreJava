package com.csi.abstrction;

abstract class Test{
	int id;
	String name;
	double salary;
	
	public Test(int id, String name, double sal) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.salary=sal;
		
		System.out.println("Test class constructor");
	}
	
	abstract void gun();
	
	final void sun() {
		System.out.println("In test class");
	}
	
}

public class Demo extends Test {
	
	public Demo(int id, String name, double sal) {
		super(id, name, sal);
		// TODO Auto-generated constructor stub
	}

	@Override
	void gun() {
		// TODO Auto-generated method stub
		System.out.println("Demo gun");
		
	}

	public static void main(String[] args) {
	   
	   Demo objDemo= new Demo(1, "s", 5468451.684);
	   
	   objDemo.sun();
	   objDemo.gun();
	  
	}

	
}
