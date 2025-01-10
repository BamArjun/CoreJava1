package oop;

public class counterwithStaticVar {
	static int count = 0;
	 public counterwithStaticVar() {
		 count++;
		// TODO Auto-generated constructor stub
	}
	 void display() {
		 System.out.println(count);
	 }
	 public static void main(String[] args) {
		new counterwithStaticVar().display();
		new counterwithStaticVar().display();
		new counterwithStaticVar().display();
	}
}
