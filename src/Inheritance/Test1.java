package Inheritance;

public class Test1 {
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.print();
		ParentClass pc=new ParentClass();
		pc.pprint();
		cc.pprint();
	}

}
