import java.util.Scanner;

class Student
{
	String name, city;
	int age;
	Scanner input = new Scanner(System.in);
	
	void readdata()
	{
		System.out.print("Enter the name: ");
		name = input.next();
		System.out.println("");
		System.out.print("Enter the city: ");
		city = input.next();
		System.out.print("");
		System.out.print("Enter the age: ");
		age = input.nextInt();
		System.out.print("");
		
	}
	
	void printdata()
	{
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Age: " + age);
	}
}

class p45
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.readdata();
		s.printdata();
	}
}
