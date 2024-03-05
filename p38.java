import java.util.Scanner;
public class p38
{
	public static void main(String args[])
	{
		int i, j, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		int[] numberArray = new int[n];
		System.out.println("Enter the elements:");
		for(i=0; i<n; i++)
		{
			numberArray[i] = input.nextInt();
		}
		
		
		for(i=1; i<n; i++)
		{
			for(j=0; j<i; j++)
			{
				if(numberArray[i]<numberArray[j])
				{
					temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
		
		System.out.println("Largest = " + numberArray[n-1]);
		System.out.println("Second largest = " + numberArray[n-2]);
		
					
	}
}

		
