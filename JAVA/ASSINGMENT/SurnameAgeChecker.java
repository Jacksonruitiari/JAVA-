import java.util.Scanner;

public class SurnameAgeChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Ask for surname and age
        System.out.print("Enter your surname: ");
        String surname = userInput.nextLine();
        
        System.out.print("Enter your current age: ");
        int age = userInput.nextInt();
        
        // Calculate the length of the surname
        int surnameLength = surname.length();
        System.out.println("The number of characters in your surname is: " + surnameLength);
        
        // Check if age is even or odd
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }
        
        userInput.close();
    }
}
