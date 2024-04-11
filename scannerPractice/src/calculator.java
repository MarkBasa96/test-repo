import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        double result = 0.0; // Initialize result variable
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter your Second Number: ");
        double num2 = scan.nextDouble();

        System.out.print("Choose the operation (+, -, *, /): ");
        char operation = scan.next().charAt(0); // Read the operation as a character

        // Perform the operation based on the character input
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    System.exit(0); // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid operation."); // Print message for invalid operation
                System.exit(0); // Exit the program for invalid operation
        }

        // Print the result
        System.out.println("");
        System.out.println("The result is: " + result);

        scan.close(); // Close scanner to avoid resource leak
    }
}
