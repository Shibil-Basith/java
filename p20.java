import java.util.Scanner;
class p20{
	public static void main(String args[]){
		int count, i, gp, pass = 1, failNumbers = 0;
		float totalMark = 0, averageMark;
		String grade="";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of subjects: ");
		count = input.nextInt();
		
		System.out.println("Enter the marks of " + count + " subjects: ");
		for(i=0; i<count; i++)
		{	
			int mark = input.nextInt();
			while(mark<0 || mark>100)
			{
				System.out.println("Mark should be between 0-100");
				System.out.println("Re-enter the mark:");
				mark = input.nextInt();
			}
				
			
			
			if(mark<20){
				pass = 0;
				failNumbers++;
				}
			else 
				totalMark += mark;
			
		}
		
		
		if(pass == 0)
			System.out.println("You have failed in " + failNumbers + " subjects");
		else{
			averageMark = totalMark / count;
			gp = (int)averageMark/10;
		
			System.out.println("Total mark = " + totalMark);
			System.out.println("Average mark = " + averageMark);
		
			
			if(gp<9){
				if(gp==7) grade = "B+";
				if(gp==6) grade = "B";
				if(gp==5) grade = "C+";
				if(gp==4) grade = "C";
				if(gp<4) grade = "D+";
				}
			else
				grade = "A+";
				
		
		
		
		
		System.out.println("Grade = " + grade);
	}
	}
}
