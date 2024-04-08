import java.util.Scanner;

public class taxComputation{
    
    public static void main(String[] args) {
        
        int taxable;
        double tax;

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter your Annual Salary: ");        
        int annualSalary = scan.nextInt();

        if (annualSalary < 250000){
            System.out.println("No tax.");
            return;
        } else if (annualSalary <=400000){
            tax = (annualSalary - 250000) * 0.15;
            taxable = annualSalary - 250000;
        } else if (annualSalary <=800000){
            tax = 22500 + (annualSalary - 401000) * 0.20;
            taxable = annualSalary - 401000;
        } else if (annualSalary <=2000000){
            tax = 102500 + (annualSalary - 801000) * 0.25;
            taxable = annualSalary - 801000;
        } else if (annualSalary <=8000000){
            tax = 402500 + (annualSalary - 2000000) * 0.30;
            taxable = annualSalary - 2000000;
        } else{
            tax = 2202500 + (annualSalary - 8000001) * 0.35;
            taxable = annualSalary - 8000001;
        }
        
        
        int myTax = (int) tax; // narrowing typecasting

            System.out.println("Taxable income: " + taxable);
            System.out.println("Tax is " + myTax + ".");
            System.out.println();
        
        scan.close();
    }
}