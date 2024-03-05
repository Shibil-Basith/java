import java.util.*;

class PointerObject {
    int rollno;
    String name;

    // Member function to set data values
    void setData(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Member function to print which object has invoked it
    void print() {
        System.out.println("Roll Number: " + this.rollno);
        System.out.println("Name: " + this.name);
    }
}

class p58 {
    public static void main(String[] args) {

        int rollno;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Roll No of student 1: ");
        rollno = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name of student 1: ");
        name = input.nextLine();
        PointerObject s1 = new PointerObject();
        s1.setData(rollno, name);

        System.out.println("Enter Roll No student 2: ");
        rollno = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name of student 2: ");
        name = input.nextLine();
        PointerObject s2 = new PointerObject();
        s2.setData(rollno, name);

        System.out.println("Enter Roll No of student 3: ");
        rollno = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name of student 3: ");
        name = input.nextLine();
        PointerObject s3 = new PointerObject();
        s3.setData(rollno, name);


        System.out.println("student 1: ");
        s1.print();
        System.out.println("student 2: ");
        s2.print();
        System.out.println("student 3: ");
        s3.print();
    }
}
