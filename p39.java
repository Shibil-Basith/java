import java.util.Scanner;
public class p39
{
	public static void main(String args[])
	{
		int i, j, search, pos=-1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		int[] numberArray = new int[n];
		int[] positions = new int[n];
		System.out.println("Enter the elements:");
		for(i=0; i<n; i++)
		{
			numberArray[i] = input.nextInt();
		}
		
		
		System.out.println("Enter the element to search:");
		search = input.nextInt();
		
		
		for(j=0, i=0; i<n; i++)
		{

				if(numberArray[i] == search)
				{
					pos = i+1;
					positions[j] = pos;
					j++;

					
				}
			
		}
		
		if(pos!=-1)
		{
			System.out.print(search + " is at positions: "); 
			for(i=0; i<j; i++)
			{
				System.out.print(positions[i] + ((i!=j-1)?", ":""));
			}
			System.out.println("");
		}
		else
			System.out.println(search + " not found in the list");		
	}
}

		
