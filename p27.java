import java.util.Scanner;
public class p27
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = input.nextInt();
		System.out.println("First " + n + " natural numbers: ");
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}
		
