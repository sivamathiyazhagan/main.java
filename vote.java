package j12;
import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}
public class VoteEligibilityChecker {
    public static void checkEligibility(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Invalid age. Age cannot be negative.");
        }
        if (age >= 18) {
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (NegativeAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid age as a positive integer.");
        } 
    }
}
