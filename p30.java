import java.util.Scanner;
public class p30
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lower limit: ");
		int l = input.nextInt();
		System.out.println("Enter the upper limit: ");
		int u = input.nextInt();
		
		System.out.println("Even numbers are:");
		for(int i=l; i<=u; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
		
