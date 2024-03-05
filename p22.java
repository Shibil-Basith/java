import java.util.Scanner;
class p22{
	public static void main(String args[]){
		double result;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		result = simpleCalculator(a, b);
		System.out.println("Result = " + result);
		
		
	}
	
	public static double simpleCalculator(int a, int b)
	{
		System.out.println("Select any operation from the given: ");
		Scanner input = new Scanner(System.in);
		System.out.println("+		-		*		/		%");
		char operator = input.next().charAt(0);
		if(operator=='+'){
			return a+b;
		}
		else if(operator=='-')
		{
			return a-b;
		}
		else if(operator=='*')
		{
			return a*b;
		}
				
		else if(operator=='/')
		{
			if(b==0)
			{
				System.out.println("Second operand cannot be 0 for remainder and division");
				System.out.println("Select any other operand");
				return simpleCalculator(a, b);
			}	
			else return a/b;
		}
		else if(operator=='%')
		{
			if(b==0)
			{
				System.out.println("Second operand cannot be 0 for remainder and division");
				System.out.println("Select any other operand");
				return simpleCalculator(a, b);
			}
			else return a%b;
		}
		else{
			System.out.println("wrong operator selection");
		}
		
		return simpleCalculator(a,b);
	}
}
	
