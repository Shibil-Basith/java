import java.util.Scanner;

class Box
{
	
	float height, width, depth;
	double area, volume;
	Box(float height, float width, float depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	double area()
	{
		area = 2*(width * height + width * depth + height * depth);
		return area;
	}
	
	double volume()
	{
		volume = height*width*depth;
		return volume;
	}
}

class p51
{
	public static void main(String args[])
	{
		float height, width, depth;
		double area, volume;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = input.nextFloat();
		System.out.println("Enter the width: ");
		width = input.nextFloat();
		System.out.println("Enter the depth: ");
		depth = input.nextFloat();
		Box b = new Box(height, width, depth);
		area = b.area();
		volume = b.volume();
		System.out.println("Area = " + area);
		System.out.println("Volume = " + volume);
	}
}
		
		
		
