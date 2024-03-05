import java.util.Scanner;
class p11{
	public static void main(String args[]){
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 2 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		}
	}
