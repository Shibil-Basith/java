import java.util.Scanner;
public class p36
{
	public static void main(String args[])
	{
		int num, digits=0, sum=0, rem;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = input.nextInt();
		int n = num;
		while(n>0)
		{
			rem = n%10;
			sum+=rem;
			digits++;
			n/=10;
		}
		System.out.println("Number of digits = " + digits);
		System.out.println("Sum = " + sum);
	}
}
		
