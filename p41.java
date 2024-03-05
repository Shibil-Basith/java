import java.util.Scanner;
public class p41
{
	public static void main(String args[])
	{
		int i, j, m, n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the order:");
		System.out.print("m :");
		m = input.nextInt();
		System.out.print("n :");
		n = input.nextInt();
		
		
		int matrix1[][] = new int[m][n];
		int matrix2[][] = new int[m][n];
		System.out.println("Enter the elements to matrix1 :\n\n");
		for(i=0; i<m; i++)
		{
			for(j=0;j<n;j++)
			{
				matrix1[i][j] = input.nextInt();
			}
		}
		
		
		
		System.out.println("Enter the elements to matrix2 :\n\n");
		for(i=0; i<m; i++)
		{
			for(j=0;j<n;j++)
			{
				matrix2[i][j] = input.nextInt();
			}
		}
		
		
		System.out.println("The given matrices:\n\n");
		
		System.out.println("Matrix1: \n\n");
		for(i=0; i<m; i++)
		{
			System.out.println("");
			for(j=0;j<n;j++)
			{
				System.out.print(matrix1[i][j] + "	");
				
			}
			System.out.println("");
			System.out.println("");
		}
		
		
		System.out.println("Matrix2: \n\n");
		for(i=0; i<m; i++)
		{
			System.out.println("");
			for(j=0;j<n;j++)
			{
				System.out.print(matrix2[i][j] + "	");
				
			}
			System.out.println("");
			System.out.println("");
		}
		
		
		System.out.println("sum of Matrix1 and Matrix2: \n\n");
		for(i=0; i<m; i++)
		{
			System.out.println("");
			for(j=0;j<n;j++)
			{
				System.out.print(matrix1[i][j]+matrix2[i][j] + "	");
				
			}
			System.out.println("");
		}
			
	}
}

		
