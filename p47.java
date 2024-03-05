import java.util.Scanner;

class Room
{
	int roomNo, roomType, acMachine;
	double roomArea;
	
	void setdata(int roomNo, int roomType, int acMachine, double roomArea)
	{
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.acMachine = acMachine;
		this.roomArea = roomArea;
	}
	
	
	void displaydata()
	{
		System.out.println("Room No\t\t\tRoom Type\t\t\tAC\t\t\tRoom Area");
		System.out.println(roomNo+"\t\t\t"+roomType+" bhk\t\t\t"+((acMachine==1)?"   Available":"   Not available")+"\t\t   "+roomArea);
	}
	
	
}

class p47
{
	public static void main(String args[])
	{
		int roomNo, roomType, acMachine;
		double roomArea;
		
		Scanner input = new Scanner(System.in);
		Room r = new Room();
		System.out.print("Enter the room number: ");
		roomNo = input.nextInt();
		System.out.println("");
		System.out.print("Enter the room type (1 for 1bhk, 2 for 2bhk): ");
		roomType = input.nextInt();
		System.out.print("");
		System.out.print("Air conditioner facility (1 for yes, 0 for no): ");
		acMachine = input.nextInt();
		System.out.println("");
		System.out.print("Room area: ");
		roomArea = input.nextDouble();
		System.out.println("");
		r.setdata(roomNo, roomType, acMachine, roomArea);
		r.displaydata();
	}
}
