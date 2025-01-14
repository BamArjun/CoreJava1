package Inheritance;
/*
 Create a class named 'Member' having the following members: 
Data members 
1 - Name 
2 - Age 
3 - Phone number 
4 - Address 
5 - Salary 
It also has a method named 'printSalary' which prints the salary of the members. 
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes 
have data members 'specialization' and 'department' respectively. Now, assign name, age, phone 
number, address and salary to an employee and a manager by making an object of both of these classes 
and print the same. 
 */
public class Member {
	String Name;
	int age;
	String phno;
	String address;
	int Salary;
//	public Member(String Name, int age,String phno,String address,int Salary) {
//		this.Name=Name;
//		this.age=age;
//	   this.phno=phno;
//	this.address=address;
//		this.Salary=Salary;
		
	//}
	void printsalary() {
		System.out.println("the salary of  member="+Salary);
		
	}

}
