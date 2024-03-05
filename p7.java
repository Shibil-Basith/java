import java.util.Scanner;
class p7{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any four numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		if(a>b)
			if(a>c)
				if(a>d)
					System.out.println(a + " is the largest");
				else
					System.out.println(d + " is the largest");
			else
				if(c>d)
					System.out.println(c + " is the largest");
				else
					System.out.println(d + " is the largest");
		else if(b>c)
			if(b>d)
				System.out.println(b + " is the largest");
			else
				System.out.println(d + " is the largest");
		else if(c>d)
			System.out.println(c + " is the largest");
		else
			System.out.println(d + " is the largest");
		}
	}
