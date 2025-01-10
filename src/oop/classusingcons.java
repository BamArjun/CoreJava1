package oop;

public class classusingcons {
String name;
int roll;
static String college="siddhanath";
 public classusingcons(String name,int roll) {
this.name=name;
this.roll=roll;
 }
 void print() {
	 System.out.println(name+"\n"+roll+"\n"+college);
 }
public static void main(String[] args) {

	classusingcons c1= new classusingcons("kushal", 10);
	classusingcons c2= new classusingcons("kushalmalla", 100);
c1.print();
c2.print();
}
}
