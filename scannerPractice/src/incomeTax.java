import java.util.Scanner;

public class incomeTax {
    public static void main (String[] args){

        double taxableIncome = 0;
        double tax = 0;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter annual salary: ");
        double annualSalary = scan.nextDouble();

        if (annualSalary <250000){
            System.out.println("No tax");
            return;
        } else if (annualSalary <=400000){
            taxableIncome = (annualSalary - 250000);
            tax = (annualSalary - 250000) * 0.15;
        } else if (annualSalary <=800000){
            taxableIncome = (annualSalary - 400000);
            tax = 22500 + (annualSalary - 400000) * 0.20;
        } else if (annualSalary <=2000000){
            taxableIncome = (annualSalary - 800000);
            tax = 102500 + (annualSalary - 800000) * 0.25;
        } else if (annualSalary <=8000000){
            taxableIncome = (annualSalary - 2000000);
            tax = 402500 + (annualSalary - 2000000) * 0.30;
        } else{
            taxableIncome = (annualSalary - 8000000);
            tax = 2202500 + (annualSalary - 800000) * 0.35;
        }

        int taxIncome = (int) taxableIncome;

        System.out.println("Taxable income: " + taxIncome);
        System.out.println("Tax is " + tax);

        scan.close();

    }
    
}
