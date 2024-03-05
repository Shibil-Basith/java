import java.util.Scanner;
public class p28
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = input.nextInt();
		System.out.println("Even numbers upto " + n + " are:");
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
		
