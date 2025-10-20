package Task3.after;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time value: ");
        double value = sc.nextDouble();

        System.out.print("Enter time type (hours/minutes/seconds): ");
        String type = sc.next();

        TimeConverter converter = new TimeConverter(value, type);
        converter.displayResult();
    }
}
