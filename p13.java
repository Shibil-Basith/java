import java.util.Scanner;
class p13{
	public static void main(String args[]){
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any numbers: ");
		int a = input.nextInt();
		if ((a >= -999 && a <= -100) || (a >= 100 && a <= 999)) 
            		System.out.println("It's a three-digit number.");
		else
			System.out.println("The given number " + a + " is not a three digit number");
		}
	}
