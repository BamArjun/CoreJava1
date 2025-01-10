package oop;

public class Student_class {
int id;
int rollno;
String name;
static String college ="snsc";//for memory management OR same value for all.
void PrintStudent() {
	System.out.println("Id"+id+"\n"+"rollno:"+rollno+"\n"+"name:"+name+"\n"+"college:"+college);
}
public static void main(String[] args) {
	Student_class s1 = new Student_class();
	s1.id=10;
	s1.name="arjun";
	s1.rollno=55;
	s1.PrintStudent();
	System.out.println("\n");
	Student_class s2 = new Student_class();
	s2.id=100;
	s2.name="arjun bam";
	s2.rollno=550;
	s2.PrintStudent();



}
}
