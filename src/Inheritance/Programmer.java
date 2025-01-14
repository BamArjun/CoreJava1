package Inheritance;

public class Programmer extends Employee {
	
	String PL;
	String project;
	int bonus;
	
	void print() {
		super.print();
		System.out.println("PL="+PL);
		System.out.println("project="+project);
		System.out.println("bonus="+bonus);
		
		
	}
	

}
