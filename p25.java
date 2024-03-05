import java.util.Scanner;
class p25{
	public static void main(String args[]){
		
		double b=0.0;
		int r, pr, c;
	
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
		
		if(cr<=50) c=1; 
		else if(cr<=100) c=2; 
		else if(cr<=200) c=3; 
		else if(cr<=250) c=4; 
		else if(cr<=400) c=5; 
		else if(cr<=500) c=6;
		else c=7;
		
		switch(c)
		{
			case 1: b = cr*3.50;
				break;
				
			case 2: b = 50*3.50 + (100-cr) * 3.95;
				break;
				
			case 3: b = 50*3.50 + 100*3.95 + (200-cr)*6.80;
				break;
				
			case 4: b = 50*3.50 + 100*3.95 + 200*6.80 + (250 - cr)*8.00;
				break;
				
			case 5: b = cr*7.35;
				break;
				
			case 6: b = cr*7.60;
				break;
				
			case 7: b = cr*8.50;
				break;
			
		}
		
		
		System.out.println("Bill = " + b);
	}
}
