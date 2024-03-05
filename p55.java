import java.util.Scanner;

class Member {
    String name;
    int age;
    String phone_number;
    String address;
    double salary;

    public Member(String name, int age, String phone_number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: $" + this.salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phone_number, String address, double salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phone_number, String address, double salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}

public class p55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Information:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Age: ");
        int empAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        String empPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String empAddress = scanner.nextLine();
        System.out.print("Salary: $");
        double empSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Specialization: ");
        String empSpecialization = scanner.nextLine();

        Employee employee = new Employee(empName, empAge, empPhoneNumber, empAddress, empSalary, empSpecialization);

        System.out.println("\nEnter Manager Information:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        String managerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Salary: $");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);

        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phone_number);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);
        System.out.println();

        System.out.println("Manager Information:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phone_number);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}

