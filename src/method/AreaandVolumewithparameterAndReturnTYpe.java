package method;

public class AreaandVolumewithparameterAndReturnTYpe {
public static void main(String[] args) {
int a=	Area(5, 2);
	System.out.println("the area is :"+a);
	volume(a, 2);
}
static int Area(int l,int b) {
	int area=l*b;
	return area;
}
static void volume(int area,int h) { 
	int vol=area*h;
	System.out.println("Volume:"+vol);
	
}

}
