import java.util.*;

class Salary
{
    double hra, cca, bp, total;
}

class Tax
{
    String name;
}

class IncomeTax extends Salary
{
    double iTax = 0;
    Tax t = new Tax();
    void acceptData(String name, double bp)
    {
        super.bp = bp;
        t.name = name;
    }

    void display(){
        hra = 0.1*bp;
        double da = 0.3*bp;
        cca = 200;
        total = 12*(bp+da+hra+cca);
        if(total>60000 && total<=80000) iTax = 0.2*total;
        if(total>80000 && total<=100000) iTax = 0.3*total;
        if(total>100000) iTax = 0.4*total;

        System.out.println("Name: " + t.name);
        System.out.println("Basic Pay: " + bp);
        System.out.println("Home Rent Allowance: " + hra);
        System.out.println("City Compensatory Allowance: " + cca);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("Total Salary: " + total);
        System.out.println("\n\n\nTax Information: ");
        if(iTax==0){
            System.out.println("Tax not payable");
        }
        else{
            System.out.println("Income Tax: " + iTax);
        }

    }
}


class p57
{
    public static void main(String args[])
    {
        String name;
        int bp = 0;
        IncomeTax i = new IncomeTax();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = input.nextLine();
        do{
        System.out.println("Enter the basic pay: ");
        bp = input.nextInt();
        if(bp<=0)
        {
            System.out.println("Invalid basic pay...\nEnter valid basic pay");
        }
        }while(bp<=0);
        i.acceptData(name, bp);
        i.display();
    }
}