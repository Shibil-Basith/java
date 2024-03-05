import java.util.Scanner;

class Cylinder
{
	
	float radius, height;
	double area, volume;
	double calculate(float radius, float height)
	{
		this.radius = radius;
		this.height = height;
		area = (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
		return area;
	}
	
	double calculate()
	{
		volume = Math.PI*Math.pow(this.radius, 2)*this.height;
		return volume;
	}
}

class p50
{
	public static void main(String args[])
	{
		float radius, height;
		double area, volume;
		Scanner input = new Scanner(System.in);
		Cylinder c = new Cylinder();
		System.out.println("Enter the height: ");
		height = input.nextFloat();
		System.out.println("Enter the radius: ");
		radius = input.nextFloat();
		area = c.calculate(radius, height);
		volume = c.calculate();
		System.out.println("Area = " + area);
		System.out.println("Volume = " + volume);
	}
}
		
		
		
