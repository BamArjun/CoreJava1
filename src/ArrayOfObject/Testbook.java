package ArrayOfObject;
import java.util.Scanner;
public class Testbook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//store and print data fo 5 books.
		Book book[]=new Book[2];
		//write data in array

		for(int i=0;i<book.length;i++) {
			System.out.println(" enter book id,name,author,price:");
	
		Book b = new Book();
		int id;
		String name;
		String author;
		int price;
		//int id=sc.nextInt();
		b.setId(id=sc.nextInt());
		b.setName(name=sc.next());
		b.setAuthor(author=sc.next());
		b.setPrice(price=sc.nextInt());
		book[i]=b;
		}
		// read book data
		for(Book bk:book) {
			System.out.println(bk);
		}
		
	}

}
