package oop;

import java.util.Scanner;

public class conOfClassAndObj_Book {
	String name;
	String author;
	int price;
	int page;
	
	void printBook() {
		System.out.println(name);
		System.out.println(author);
		System.out.println(price);
		System.out.println(page);
}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		conOfClassAndObj_Book b=new conOfClassAndObj_Book();
		b.name=("nepali");
		//System.out.println("enter your book name");
		//b.name=sc.next();
		b.author=("arjun ");
		b.page=2000;
		b.price=240;
		b.printBook();
	}

}
