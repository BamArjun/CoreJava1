package Encapulation;

public class Student {

private	int roll;
private	String name;
private	String collage;
private	int age;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollage() {
	return collage;
}
public void setCollage(String collage) {
	this.collage = collage;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", collage=" + collage + ", age=" + age + "]";
}
public static void main(String[] args) {
	Student s= new Student();
	s.setRoll(10);
	s.setName("arjun");
	s.setCollage("SNSC");
	s.setAge(20);
	System.out.println(s);
}
}
