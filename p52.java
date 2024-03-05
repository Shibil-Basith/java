import java.util.Scanner;

abstract class Figure
{
	
	double dimension1, dimension2;
	Figure(double dimension1, double dimension2)
	{
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	
	abstract double area();	
}

class Rectangle extends Figure
{
	Rectangle(double length, double breadth)
	{
		super(length, breadth);
	}
	
	double area()
	{
		return dimension1*dimension2;
	}
}

class Triangle extends Figure
{
	Triangle(double base, double height)
	{
		super(base, height);
	}
	
	double area()
	{
		return 0.5*dimension1*dimension2;
	}
}
	

class p52
{
	public static void main(String args[])
	{
		double d1, d2, areaR, areaT;
		Scanner input = new Scanner(System.in);
		System.out.println("Rectangle dimensions");
		System.out.println("Enter the length: ");
		d1 = input.nextDouble();
		System.out.println("Enter the breadth: ");
		d2 = input.nextDouble();
		Figure r = new Rectangle(d1, d2);
		areaR = r.area();
		System.out.println("Triangle dimensions");
		System.out.println("Enter the base: ");
		d1 = input.nextDouble();
		System.out.println("Enter the height: ");
		d2 = input.nextDouble();
		Figure t = new Triangle(d1, d2);
		areaT = t.area();
		System.out.println("Area of Rectangle= " + areaR);
		System.out.println("Area of Triangle = " + areaT);
	}
}
		
		
		
