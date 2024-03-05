import java.util.Scanner;
class p21{
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
		if(operator!='+')
			if(operator!='-')
				if(operator!='*')
					if(operator!='/')
						if(operator!='%')
						{
							System.out.println("Invalid operator selection");
							return simpleCalculator(a, b);
						}
						else
							if(b==0)
							{
								System.out.println("Second operand cannot be 0 for remainder and division");
								System.out.println("Select any other operand");
								return simpleCalculator(a, b);
							}
							else
								return a%b;
					else
							if(b==0)
							{
								System.out.println("Second operand cannot be 0 for remainder and division");
								System.out.println("Select any other operand");
								return simpleCalculator(a, b);
							}
							else
								return a/b;
				else return a*b;
			else return a-b;
		else return a+b;
	}
}
	
