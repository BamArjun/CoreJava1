package ArrayOfObject;
import java.util.Scanner;
public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee[] = new Employee[2];
		for (int i=0;i<employee.length;i++) {
			Employee E= new Employee();
			System.out.println("enter the employee attributes");
			int id;
			String name;
			String company;
			int salary;
			String department;
			String post;
			String city;
			E.setId(id=sc.nextInt());
			E.setCity(city=sc.next());
			E.setName(name=sc.next());
			E.setCompany(company=sc.next());
			E.setDepartment(department=sc.next());
			E.setPost(post=sc.next());
			E.setSalary(salary=sc.nextInt());
			employee[i]=E;
		}
		
		for(Employee e1:employee )
		{
			
			System.out.println(e1);
			int salary=0;
			int ts=salary+e1.getSalary();
			System.out.println("total salary="+ts);
		}
		
	}

}
