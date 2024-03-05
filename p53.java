import java.util.Scanner;

abstract class Shape
{
	
	double area;
	abstract double showArea();	
}

class Rectangle extends Shape
{
	double length, breadth;
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	double showArea()
	{
		area = length*breadth;
		return area;
	}
}

class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	double showArea()
	{
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
}
	

class p53
{
	public static void main(String args[])
	{
		double length, breadth, radius, areaR, areaC;
		Scanner input = new Scanner(System.in);
		System.out.println("Rectangle dimensions");
		System.out.println("Enter the length: ");
		length = input.nextDouble();
		System.out.println("Enter the breadth: ");
		breadth = input.nextDouble();
		Shape r = new Rectangle(length, breadth);
		areaR = r.showArea();
		System.out.println("Circle dimensions");
		System.out.println("Enter the radius: ");
		radius = input.nextDouble();
		Shape c = new Circle(radius);
		areaC = c.showArea();
		System.out.println("Area of Rectangle= " + areaR);
		System.out.println("Area of Circle= " + areaC);
	}
}
		
		
		
