import java.util.Scanner;
public class p33
{
	public static void main(String args[])
	{
		int count=0;
		double sum=0, average;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		int[] numberArray = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		{
			numberArray[i] = input.nextInt();
			if(numberArray[i]%2 == 0)
			{
				sum+=numberArray[i];
				count++;
			}
		}
		average = sum/count;
		System.out.println("Average = " + average);
	}
}
		
