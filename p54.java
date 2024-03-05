import java.util.*;

class Account {
    protected int acc_no;
    protected double balance;

    public Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private int aadhar_no;

    public Person(int acc_no, double balance, String name, int aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class p54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        List<Person> personsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Account Number for Person " + (i + 1) + ": ");
            int accNo = scanner.nextInt();
            System.out.print("Enter Balance for Person " + (i + 1) + ": ");
            double balance = scanner.nextDouble();
			scanner.nextLine();
            System.out.print("Enter Name for Person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter Aadhar Number for Person " + (i + 1) + ": ");
            int aadharNo = scanner.nextInt();

            Person person = new Person(accNo, balance, name, aadharNo);
            personsList.add(person);
        }

        System.out.println("\nDetails of Persons:");
        for (Person person : personsList) {
            System.out.println();
            person.disp();
        }
    }
}
