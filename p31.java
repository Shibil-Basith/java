import java.util.Scanner;
public class p31
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = input.nextInt();
		
		System.out.println("First " + n + " natural numbers are:");
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
			
	}
}
		
