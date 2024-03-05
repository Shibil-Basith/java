import java.util.Scanner;
public class p40
{
	public static void main(String args[])
	{
		int i, j, sum = 0;
		int matrix[][] = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(i=0; i<3; i++)
		{
			for(j=0;j<3;j++)
			{
				matrix[i][j] = input.nextInt();
				sum+=matrix[i][j];
			}
		}
		
		
		System.out.println("The given matrix:");
		
		for(i=0; i<3; i++)
		{
			System.out.println("");
			for(j=0;j<3;j++)
			{
				System.out.print(matrix[i][j] + "	");
				
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Sum = " + sum);	
	}
}

		
