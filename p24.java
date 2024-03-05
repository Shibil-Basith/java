import java.util.Scanner;
class p24{
	public static void main(String args[]){
		
		double b;
		int r, pr;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the meter reading: ");
		r = input.nextInt();
		
		System.out.println("Enter previous reading: ");
		pr = input.nextInt();
		
		while(pr>r || pr<=0 && r!=0 || r<0 || pr<0)
		{
			System.out.println("problem with inputs");
			
			System.out.println("Enter the meter reading: ");
			r = input.nextInt();
		
			System.out.println("Enter previous reading: ");
			pr = input.nextInt();
		}
		
		int cr = r-pr;
		
		if(cr<=50) b = cr*3.50;
		else if(cr<=100) b = 50*3.50 + (100-cr) * 3.95;
		else if(cr<=200) b = 50*3.50 + 100*3.95 + (200-cr)*6.80;
		else if(cr<=250) b = 50*3.50 + 100*3.95 + 200*6.80 + (250 - cr)*8.00;
		else if(cr<=400) b = cr*7.35;
		else if(cr<=500) b = cr*7.60;
		else b = cr*8.50;
		
		System.out.println("Bill = " + b);
	}
}
