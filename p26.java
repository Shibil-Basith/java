import java.util.Scanner;
class p26{
	public static void main(String args[]){
		
		double result;
		result = simpleCalculator();
		System.out.println("Result = " + result);
		
		}
		
		
		public static double simpleCalculator()
		{
		
		
			int a, b;
			float result;
			char op;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			a = input.nextInt();
		
			System.out.println("Enter the second number: ");
			b = input.nextInt();
		
			System.out.println("Choose any from the following operators: ");
			System.out.println("+   -   *   /   %");
		
			op = input.next().charAt(0);
		
			switch(op)
			{
				case '+': result = a+b;
					  return result;
				
				case '-': result = a-b;
					  return result;
				
				case '*': result = a*b;
					  return result;
				
				case '/': 	if(b!=0)
						{
							result = a/b;
							return result;
						}
				  	  	else
				  	  	{
				  	  		System.out.println("second number should not be 0 for division");
				  	  		return simpleCalculator();
				  	  	}
				
				case '%': 	if(b!=0)
						{
							result = a%b;
							return result;
						}
						else
						{
							System.out.println("second number should not be 0 for remainder");
							return simpleCalculator();
						}
				default:	System.out.println("Invalid operator selection");
						return simpleCalculator();
			}
		}
	}
