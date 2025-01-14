package Inheritance;

public class Testmember {
public static void main(String[] args) {
	Employee1 e1=new Employee1();
//	Employee1 e1=new Employee1("ARJun", 022, "9812", "MNR", 100000, "java");
	e1.address ="mnr";
System.out.println("Address="+e1.address);	
//	e1.age=22;
//	e1.Name="AB";
//	e1.phno="1273";
//	e1.specialization="java master";
	e1.Salary=123456;
e1.printsalary();
}
}
