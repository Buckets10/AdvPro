import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CodeLab2M1 {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 120) {
            throw new InvalidAgeException("Invalid age! Age must be greater than 0 and less than 120.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Call validation method
            validateAge(age);

            // If no exception, valid age
            System.out.println("Your age is valid: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
