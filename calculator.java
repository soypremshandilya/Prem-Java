import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");

        System.out.print("Enter the choice (1/2/3): ");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
                break;
                
            case 2:
                result = num1 * num2;
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
                break;
                
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
                
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
        scanner.close();
    }
}
