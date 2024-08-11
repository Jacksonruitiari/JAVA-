import javax.swing.*;

/**
 * This program checks if a number entered by the user is a palindrome.
 * A palindrome number reads the same forwards and backwards.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        // Prompt the user to enter a number using a dialog box
        String userInput = JOptionPane.showInputDialog("Enter the number");
        int originalNumber = Integer.parseInt(userInput); // Convert the input string to an integer
        int reversedNumber = 0; // This will store the reversed number for comparison
        int numberToReverse = originalNumber; // Make a copy of the original number for processing
        
        // Loop to reverse the digits of the number
        while (numberToReverse != 0) {
            int lastDigit = numberToReverse % 10; // Extract the last digit of the number
            reversedNumber = reversedNumber * 10 + lastDigit; // Build the reversed number
            numberToReverse /= 10; // Remove the last digit from the number
        }
        
        // Check if the original number is the same as the reversed number
        if (originalNumber == reversedNumber) {
            // Display a message saying the number is a palindrome
            JOptionPane.showMessageDialog(null, originalNumber + " is a Palindrome");
        } else {
            // Display a message saying the number is not a palindrome
            JOptionPane.showMessageDialog(null, originalNumber + " is not a Palindrome");
        }
    }
}
