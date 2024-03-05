import java.util.Scanner;
public class p37
{
	public static void main(String args[])
	{
		int num, digits=0, sum=0, rem, i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = input.nextInt();
		int n = num;
		while(n>0)
		{
			digits++;
			n/=10;
		}
		n = num;
		while(n>0)
		{
			rem = n%10;
			int intermediate = 1;
			for(i=0; i<digits; i++)
			{
				intermediate*=rem;
			}
			sum+=intermediate;
			n/=10;
		}
		
		if(num==sum)
			System.out.println(num + " is armstrong number");
		else
			System.out.println(num + " is not armstrong number");
	}
}
		
