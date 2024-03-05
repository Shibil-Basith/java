import java.util.Scanner;
class p19{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any 3 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(a +" is largest");
			}
			else{
				
				System.out.println(c +" is largest");
				
			}
		}
			
		else{
			if(b>c){
				System.out.println(b +" is largest");
			}
				
			else{
				System.out.println(c +" is largest");
			}	
			}
		
	}
}
