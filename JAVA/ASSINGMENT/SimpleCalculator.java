import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Ask user for two numbers
        System.out.print("Enter the first number: ");
        double firstNumber = userInput.nextDouble();
        
        System.out.print("Enter the second number: ");
        double secondNumber = userInput.nextDouble();
        
        // Ask user for the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = userInput.next().charAt(0);

        // Calculate and display the result
        double result = 0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("The result is: " + result);
        
        userInput.close();
    }
}
