import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {

        double result = 0.0; // Initialize result variable
        int results = (int) result;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter your Second Number: ");
        double num2 = scan.nextDouble();

        scan.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Choose the operation (addition, substraction, multiplication, or division): ");
        String operation = scan.nextLine(); // Read operation as a string

        // Compare operation using equals() method instead of ==
        if (operation.equals("addition")) {
            result = num1 + num2;
        } else if (operation.equals("substraction")) {
            result = num1 - num2;
        } else if (operation.equals("multiplication")) {
            result = num1 * num2;
        } else if (operation.equals("division")) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operation."); // Print message for invalid operation
            System.exit(0); // Exit the program if operation is invalid
        }

        // Print the result
        System.out.println("");
        System.out.println("The result is: " + results);

        scan.close(); // Close scanner to avoid resource leak
    }
}
