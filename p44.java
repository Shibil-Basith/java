import java.util.Scanner;
public class p44
{
	public static void main(String args[])
	{
		int i, j, m, n, sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the order:");
		System.out.print("m :");
		m = input.nextInt();
		System.out.print("n :");
		n = input.nextInt();
		
		
		int matrix[][] = new int[m][n];
		System.out.println("Enter the elements to matrix :\n\n");
		for(i=0; i<m; i++)
		{
			for(j=0;j<n;j++)
			{
				matrix[i][j] = input.nextInt();
			}
		}
		
		
		
		
		System.out.println("Matrix: \n\n");
		for(i=0; i<m; i++)
		{
			System.out.println("");
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j] + "	");
				
			}
			System.out.println("");
			System.out.println("");
		}
		
		
		for(i=0; i<m; i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j){
					sum+=matrix[i][j];
					
				}
				
			}
		}
			System.out.println("Sum of diagonal elements = " + sum);
			
	}
}

		
