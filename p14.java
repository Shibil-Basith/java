import java.util.Scanner;
class p14{
	public static void main(String args[]){
		int age = 0, eligible = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = input.nextInt();
		if(age>=18)
			eligible = 1;
		switch(eligible){
			case 0 : System.out.println("You are not eligible for voting");
				break;
				
			case 1: System.out.println("You are eligible for voting");
				break;
				}
	}
}
