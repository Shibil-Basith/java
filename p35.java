import java.util.Scanner;
public class p35
{
	public static void main(String args[])
	{
		int a=-1, b=1, i=0, c;
		System.out.println("Fibonacci series: ");
		do{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			i++;
		}while(i<10);
	}
}
		
