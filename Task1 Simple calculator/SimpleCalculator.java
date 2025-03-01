import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("Select an operation:");
		            System.out.println("1. Addition");
		            System.out.println("2. Subtraction");
		            System.out.println("3. Multiplication");
		            System.out.println("4. Division");
		            System.out.println("5. Exit");
		            
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            
		            if (choice == 5) {
		                System.out.println("Exiting the calculator. Goodbye!");
		                break;
		            }
		            
		            System.out.print("Enter first number: ");
		            double num1 = scanner.nextDouble();
		            
		            System.out.print("Enter second number: ");
		            double num2 = scanner.nextDouble();
		            
		            double result;
		            
		            switch (choice) {
		                case 1:
		                    result = num1 + num2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 2:
		                    result = num1 - num2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 3:
		                    result = num1 * num2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 4:
		                    if (num2 != 0) {
		                        result = num1 / num2;
		                        System.out.println("Result: " + result);
		                    } else {
		                        System.out.println("Error: Division by zero is not allowed.");
		                    }
		                    break;
		                default:
		                    System.out.println("Error: Invalid choice. Please select a valid option.");
		            }
		        }
		        
		        scanner.close();
	}
}
