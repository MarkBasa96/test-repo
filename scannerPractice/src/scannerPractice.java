import java.util.Scanner;

public class scannerPractice {
    
    public static void main (String[] args){
        
        String description;
        double conversion = 0.0; // Initialize conversion with a default value
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        int grade;
        do {
            System.out.print("Enter your grade: ");
            grade = input.nextInt();
            
            System.out.println();
            
            if (grade < 0){
                System.out.println("Invalid grade. Please enter a non negative grade");
                System.out.println();
            } else if (grade >=1000){
                System.out.println("Nah! You're trippin' man. >_<");
                System.out.println();
                return;
            }else if (grade > 100){
                System.out.println("Invalid grade. Please enter a grade between 0 and 100");
                System.out.println();
            }
        } while (grade < 0 || grade > 100); // Continue asking for input until a non-negative grade is provided        
        
        input.close(); // Close the scanner
        
        if (grade >= 95){
            conversion = 4.0;
            description = "A | High Distinction";
        } else if (grade >= 90){
            conversion = 3.5;
            description = "B+ | Distinction";
        } else if (grade >= 85){
            conversion = 3.0;
            description = "B- | Very Good";
        } else if (grade >= 80){
            conversion = 2.5;
            description = "C+ | Good";
        } else if (grade >= 75){
            conversion = 2.0;
            description = "C- | Average";
        } else {
            conversion = 1.0;
            description = "F | Failed";
        }
        
        System.out.println("Your Name is " + name + " and your Grade is " + grade);
        System.out.println("Conversion: " + conversion);
        System.out.println("Grade Description: " + description);
        System.out.println(""); 
        }
    }