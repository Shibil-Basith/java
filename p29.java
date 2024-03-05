import java.util.Scanner;
public class p29
{
	public static void main(String args[])
	{
		double sum=0, average;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		int[] numberArray = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		{
			numberArray[i] = input.nextInt();
			sum+=numberArray[i];
		}
		average = sum/n;
		System.out.println("Average = " + average);
	}
}
		
