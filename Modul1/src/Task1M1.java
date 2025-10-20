import java.util.Scanner;

public class Task1M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of values: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Number of values must be greater than 0.");
                return;
            }

            int[] angka = new int[n];
            System.out.println("Enter the values:");
            for (int i = 0; i < n; i++) {
                angka[i] = scanner.nextInt();
            }

            int total = 0;
            for (int i = 0; i < n; i++) {
                total += angka[i];
            }

            double rataRata = (double) total / n;
            System.out.println("The average is: " + rataRata);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
