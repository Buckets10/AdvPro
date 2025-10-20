import java.util.Scanner;

public class Task3M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter final exam score: ");
        int score = scanner.nextInt();

        String status;
        if (score >= 60) {
            status = "Pass";
        } else {
            status = "Fail";
        }

        System.out.println("Student " + name + " has " + status);

        scanner.close();
    }
}
