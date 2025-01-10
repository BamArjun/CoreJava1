package ArrayOfObject;

public class Test10square {
public static void main(String[] args) {
//	Square s=new Square(5);
//	s.area();
//	s.perimeter();
//	Areaof10squareandRectangle r=new Areaof10squareandRectangle(4, 5);
//	r.area();
//	r.perimeter();
//	
	Square square[]=new Square[10];
	int leng=4;
	for(int i=0;i<square.length;i++) {
		Square sq=new Square(leng);
		square[i]=sq;
		leng++;
	}
	for(int i=0;i<square.length;i++) {
		square[i].area();
		
		square[i].perimeter();
	}
}
}
