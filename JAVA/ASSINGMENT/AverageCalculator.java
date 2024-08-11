import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfUnits = 5;

        // Ask user for marks in 5 units
        System.out.println("Enter the marks for the five units:");
        for (int i = 1; i <= numberOfUnits; i++) {
            System.out.print("Enter marks for unit " + i + ": ");
            int unitMarks = userInput.nextInt();
            totalMarks += unitMarks;
        }

        // Calculate the average
        double average = (double) totalMarks / numberOfUnits;
        System.out.printf("The average marks are: %.2f", average);
        
        userInput.close();
    }
}
