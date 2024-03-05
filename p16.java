import java.util.Scanner;
class p16{
	public static void main(String args[]){
		int big;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 3 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a>b)
			big = a;
		else
			big = b;
		if(c>big)
			big = c;
		System.out.println("The largest is " + big);
	}
}
