import java.util.Scanner;
class p10{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 5 numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = input.nextInt();
		int n5 = input.nextInt();
		System.out.println("Average = " + ((n1+n2+n3+n4+n5)/5.0));
		}
	}