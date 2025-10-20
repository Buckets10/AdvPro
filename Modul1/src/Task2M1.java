import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Task2M1 {
    public static void validateNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Invalid number! The number must be positive (greater than 0).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive number: ");
            int num = scanner.nextInt();

            validateNumber(num);

            System.out.println("Valid number: " + num);

        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
