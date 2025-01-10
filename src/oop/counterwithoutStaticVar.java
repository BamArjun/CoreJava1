package oop;

public class counterwithoutStaticVar {
 int count = 0;
 public counterwithoutStaticVar() {
	 count++;
	// TODO Auto-generated constructor stub
}
 void display() {
	 System.out.println(count);
 }
 public static void main(String[] args) {
	new counterwithoutStaticVar().display();
	new counterwithoutStaticVar().display();
	new counterwithoutStaticVar().display();
}
}
