import java.util.Scanner;
class p12{
	public static void main(String args[]){
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 2 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		}
	}
