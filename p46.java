import java.util.Scanner;

class Rectangle
{
	int length, breadth;
	double area;
	
	void setdata(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	
	double calcArea()
	{
		area = length * breadth;
		return area;
	}
	
	
}

class p46
{
	public static void main(String args[])
	{
		int length, breadth;
		double area;
		
		Scanner input = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.print("Enter the length: ");
		length = input.nextInt();
		System.out.println("");
		System.out.print("Enter the breadth: ");
		breadth = input.nextInt();
		System.out.println("");
		r.setdata(length, breadth);
		area = r.calcArea();
		System.out.println("Area: " + area);
	}
}
