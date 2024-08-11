import java.util.Scanner;

/**
 * This program simulates an ATM system for managing transactions in Kenyan Shillings (KES).
 * Functionalities include checking balance, withdrawing cash, transferring money, and depositing money.
 */
public class ATMTransactionManager {

    private static final double TRANSFER_CHARGE_RATE = 0.001; // 0.1% transfer charge for external transfers
    private static double accountBalance = 0; // User's account balance

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        
        while (true) {
            int selectedOption = displayMenuAndGetSelection(userInputScanner);

            if (selectedOption == 5) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            processTransaction(selectedOption, userInputScanner);
        }

        userInputScanner.close();
    }

    private static int displayMenuAndGetSelection(Scanner scanner) {
        System.out.println("\n--- ATM Transaction Manager ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Transfer Money");
        System.out.println("4. Deposit Money");
        System.out.println("5. Exit");
        System.out.print("Please select an option: ");
        return scanner.nextInt();
    }

    private static void processTransaction(int transactionType, Scanner scanner) {
        switch (transactionType) {
            case 1 -> displayBalance();
            case 2 -> performWithdrawal(scanner);
            case 3 -> executeTransfer(scanner);
            case 4 -> handleDeposit(scanner);
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    private static void displayBalance() {
        System.out.println("Your current balance is: KES " + accountBalance);
    }

    private static void performWithdrawal(Scanner scanner) {
        System.out.print("Enter the amount you wish to withdraw: KES ");
        double withdrawalAmount = scanner.nextDouble();

        if (isSufficientBalance(withdrawalAmount)) {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Your new balance is: KES " + accountBalance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    private static void executeTransfer(Scanner scanner) {
        System.out.print("Enter the amount you wish to transfer: KES ");
        double transferAmount = scanner.nextDouble();

        if (!isSufficientBalance(transferAmount)) {
            System.out.println("Transfer failed. Insufficient funds.");
            return;
        }

        System.out.print("Enter the recipient's account type (1 for same bank, 2 for other bank): ");
        int recipientAccountType = scanner.nextInt();

        if (recipientAccountType == 1) {
            accountBalance -= transferAmount;
            System.out.println("Transfer successful. Your new balance is: KES " + accountBalance);
        } else if (recipientAccountType == 2) {
            double transferCharge = calculateTransferCharge(transferAmount);

            if (isSufficientBalance(transferAmount + transferCharge)) {
                accountBalance -= (transferAmount + transferCharge);
                System.out.println("Transfer successful. Transfer charge: KES " + transferCharge + ". Your new balance is: KES " + accountBalance);
            } else {
                System.out.println("Transfer failed. Insufficient funds to cover the transfer and charge.");
            }
        } else {
            System.out.println("Invalid account type selected.");
        }
    }

    private static void handleDeposit(Scanner scanner) {
        System.out.print("Enter the amount you wish to deposit: KES ");
        double depositAmount = scanner.nextDouble();

        accountBalance += depositAmount;
        System.out.println("Deposit successful. Your new balance is: KES " + accountBalance);
    }

    private static boolean isSufficientBalance(double amount) {
        return accountBalance >= amount;
    }

    private static double calculateTransferCharge(double transferAmount) {
        return transferAmount * TRANSFER_CHARGE_RATE;
    }
}
