import java.util.Scanner;
class p9{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		System.out.println("Area = " + (3.14*radius*radius));
		System.out.println("Perimeter = " + (2*3.14*radius));
		}
	}
