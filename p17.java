import java.util.Scanner;
class p17{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a = input.nextInt();
		if((a >= -9 && a <= 0)|| (a >= 0 && a <= 9))
			System.out.println(a +" is single digit");
		else
			System.out.println(a +" is not single digit");
		
	}
}
