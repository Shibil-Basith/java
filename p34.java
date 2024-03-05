import java.util.Scanner;
public class p34
{
	public static void main(String args[])
	{
		int i=0, base, exponent;
		float result=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base: ");
		base = input.nextInt();
		System.out.println("Enter the exponent: ");
		exponent = input.nextInt();
		if(exponent>0)
		{
			do{
				result*=base;
				i++;
			}while(i<exponent);
		}
		else if(exponent<0)
		{
			do{
				result*=base;
				i--;
			}while(i>exponent);
			result = 1/result;
		}			
			
		System.out.println("Result = " + result);
	}
}
		
