
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Balance = 10000;

        System.out.println("Welcome To Kiran Bank");
        System.out.println("Opening Balance: " + Balance);

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter choice:");
            
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("Current Balance: " + Balance);
            }
            else if (opt == 2) {
                System.out.println("Enter deposit amount:");
                int deptamt = sc.nextInt();

                if (deptamt > 0) {
                    Balance = Balance + deptamt;
                    System.out.println("Deposit successful.");
                    System.out.println("Updated Balance: " + Balance);
                }
                else {
                    System.out.println("Invalid deposit amount.");
                }
            }
            else if (opt == 3) {
                System.out.println("Enter withdrawal amount:");
                int wthamt = sc.nextInt();

                if (wthamt <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                }
                else if (wthamt <= Balance) {
                    Balance = Balance - wthamt;
                    System.out.println("Withdrawal successful.");
                    System.out.println("Updated Balance: " + Balance);
                }
                else {
                    System.out.println("Transaction failed: Insufficient balance.");
                    System.out.println("Current Balance: " + Balance);
                }
            }
            else if (opt == 4) {
                System.out.println("Thank you for banking with us. Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }

        sc.close();
    }
}
