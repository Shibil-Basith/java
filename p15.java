import java.util.Scanner;
class p15{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = input.nextInt();
		if(num%2 == 0)
			System.out.println(num+" is even number");
		else
			System.out.println(num+" is odd number");
	}
}
