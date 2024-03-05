import java.util.Scanner;
class Time
{
	int hour, minute, second;
	
	void set(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	void disp()
	{
		System.out.println("Time = " + hour + " hours  " + minute + " minutes  " + second + " seconds");
	}
	
	Time add(Time t2)
	{
		Time t3 = new Time();
		t3.second = second + t2.second;
		t3.minute = minute + t2.minute + t3.second/60;
		t3.hour = hour + t2.hour + t3.minute/60;
		t3.second%=60;
		t3.minute%=60;
		t3.hour%=24;
		return t3;
	}
}

class p49
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int hour, minute, second;
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3;
		System.out.println("Enter hour of time 1: ");
		hour = input.nextInt();
		while(hour>=24){
			System.out.println("hour should be 0-23");
			hour = input.nextInt();
		}
		
		System.out.println("Enter minute of time 1: ");
		minute = input.nextInt();
		while(minute>=60){
			System.out.println("minute should be 0-59");
			minute = input.nextInt();
		}
		
		System.out.println("Enter second of time 1: ");
		second = input.nextInt();
		while(second>=60){
			System.out.println("second should be 0-59");
			second = input.nextInt();
		}
		
		t1.set(hour, minute, second);
		
		System.out.println("Enter hour of time 2: ");
		hour = input.nextInt();
		while(hour>=24){
			System.out.println("hour should be 0-23");
			hour = input.nextInt();
		}
		
		System.out.println("Enter minute of time 2: ");
		minute = input.nextInt();
		while(minute>=60){
			System.out.println("minute should be 0-59");
			minute = input.nextInt();
		}
		
		System.out.println("Enter second of time 2: ");
		second = input.nextInt();
		while(second>=60){
			System.out.println("second should be 0-59");
			second = input.nextInt();
		}
		
		t2.set(hour, minute, second);
		
		t3 = t1.add(t2);
		
		System.out.println("Time 1:");
		t1.disp();
		System.out.println("Time 2:");
		t2.disp(); 
		System.out.println("Time 3:");
		t3.disp(); 
	}
}
		


	
	
