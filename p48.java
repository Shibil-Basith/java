import java.util.Scanner;
class Distance
{
	int feet;
	float inches;
	
	void set(int feet, float inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	
	void disp()
	{
		System.out.println("Distance = " + feet + " feet" + inches + " inches");
	}
	
	Distance add(Distance d2)
	{
		Distance d3 = new Distance();
		d3.feet = feet + d2.feet;
		d3.inches = inches + d2.inches;
		return d3;
	}
}

class p48
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int feet;
		float inches;
		Distance d1 = new Distance();
		Distance d2 = new Distance();
		System.out.println("Enter feets of distance 1: ");
		feet = input.nextInt();
		System.out.println("Enter inches of distance 1: ");
		inches = input.nextInt();
		d1.set(feet, inches);
		System.out.println("Enter feets of distance 2: ");
		feet = input.nextInt();
		System.out.println("Enter inches of distance 2: ");
		inches = input.nextInt();
		d2.set(feet, inches);
		Distance d3 = d1.add(d2);
		System.out.println("Distance 1: ");
		d1.disp();
		System.out.println("Distance 2: ");
		d2.disp();
		System.out.println("Distance 3: ");
		d3.disp();
	}
}
		


	
	
