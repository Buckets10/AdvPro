package Task3.before;

import java.util.Scanner;

public class TimeConverter {
    public double time;
    public String type;

    public TimeConverter(double time, String type) {
        this.time = time;
        this.type = type;
    }

    public void convert() {
        double result = 0;

        if (type.equalsIgnoreCase("hours")) {
            result = time * 60;
            System.out.println("Minutes: " + result);
        } else if (type.equalsIgnoreCase("minutes")) {
            result = time * 60;
            System.out.println("Seconds: " + result);
        } else if (type.equalsIgnoreCase("seconds")) {
            result = time / 60;
            System.out.println("Minutes: " + result);
        } else {
            System.out.println("Invalid input!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time value: ");
        double value = sc.nextDouble();

        System.out.print("Enter time type (hours/minutes/seconds): ");
        String type = sc.next();

        TimeConverter converter = new TimeConverter(value, type);
        converter.convert();
    }
}

//Refactoring diterapkan:
//
//Rename Variable/Method
//
//Extract Method
//
//Introduce Constant
//
//Encapsulate Field
//
//Move Method
//
//Extract Superclass