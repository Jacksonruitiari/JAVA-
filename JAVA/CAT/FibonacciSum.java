/**
 * This program calculates the sum of all even-valued terms in the Fibonacci sequence
 * whose values do not exceed four million.
 */
public class FibonacciSum {
    public static void main(String[] args) {
        int maximumValue = 4000000; // The maximum value that a Fibonacci term can have
        int sumOfEvenTerms = 0; // This will accumulate the sum of even-valued terms
        int firstTerm = 1; // The first term in the Fibonacci sequence
        int secondTerm = 2; // The second term in the Fibonacci sequence
        
        // Loop to generate Fibonacci sequence until the terms exceed the maximum value
        while (secondTerm <= maximumValue) {
            if (secondTerm % 2 == 0) { // Check if the term is even
                sumOfEvenTerms += secondTerm; // Add the even term to the sum
            }
            int nextTerm = firstTerm + secondTerm; // Calculate the next term in the sequence
            firstTerm = secondTerm; // Update the first term to the current second term
            secondTerm = nextTerm; // Update the second term to the next term
        }
        
        // Output the final sum of all even-valued terms
        System.out.println("Sum of even-valued terms: " + sumOfEvenTerms);
    }
}
