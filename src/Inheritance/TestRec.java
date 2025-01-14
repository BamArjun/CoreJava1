package Inheritance;

public class TestRec {
public static void main(String[] args) {
	AreaandPeriOfRec r= new AreaandPeriOfRec(5, 6);
	r.area();
	r.perimeter();
	Square s= new Square(10);
	s.area();
	s.perimeter();
}
}
