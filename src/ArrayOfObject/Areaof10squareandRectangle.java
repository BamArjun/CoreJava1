package ArrayOfObject;

public class Areaof10squareandRectangle {
	int length;
	int breadth;
	public Areaof10squareandRectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		int Area=length*breadth;
		System.out.println("the area of " +Area);
	}
	void perimeter() {
		int peri=2*(length+breadth);
		System.out.println("perimeter="+peri);
	}

}