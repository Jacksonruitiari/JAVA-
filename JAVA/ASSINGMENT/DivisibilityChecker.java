import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number to check its divisibility: ");
        int number = userInput.nextInt();

        // Check divisibility from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println("The number " + number + " is divisible by " + i);
            }
        }
        
        userInput.close();
    }
}
