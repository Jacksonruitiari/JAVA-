import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        // Initialize the scanner to take input from the user
        Scanner userInputScanner = new Scanner(System.in);

        // Initialize an array to store 15 integer values
        int[] integerArray = new int[15];

        // Prompt the user to input 15 integers
        System.out.println("Please enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            integerArray[i] = userInputScanner.nextInt();
        }

        // a) Print the values stored in the array
        System.out.println("\nThe values stored in the array are:");
        for (int value : integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();  // Newline for readability

        // b) Check if a number is present in the array
        System.out.print("\nEnter a number to check if it's present in the array: ");
        int searchNumber = userInputScanner.nextInt();
        boolean numberFound = false;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                numberFound = true;
                break;
            }
        }
        if (!numberFound) {
            System.out.println("Number not found in this array.");
        }

        // c) Sort the array in ascending order
        Arrays.sort(integerArray);
        System.out.println("\nArray sorted in ascending order:");
        for (int value : integerArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // d) Create a new array with elements in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < integerArray.length; i++) {
            reversedArray[i] = integerArray[integerArray.length - 1 - i];
        }
        System.out.println("\nElements of the new array in reverse order:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // e) Get the sum and product of all elements
        int sumOfElements = 0;
        int productOfElements = 1;

        for (int value : integerArray) {
            sumOfElements += value;
            productOfElements *= value;
        }

        // Print the sum and product
        System.out.println("\nSum of all elements in the array: " + sumOfElements);
        System.out.println("Product of all elements in the array: " + productOfElements);

        // Closing the scanner
        userInputScanner.close();
    }
}
