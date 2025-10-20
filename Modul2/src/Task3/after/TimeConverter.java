package Task3.after;

public class TimeConverter extends Converter {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int SECONDS_IN_HOUR = 60;
    public static final int MINUTES_IN_HOUR = SECONDS_IN_HOUR;

    public TimeConverter(double value, String type) {
        super(value, type);
    }

    public void displayResult() {
        double result = convertTime();   // hasil refactoring

        if (result == -1) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Converted result: " + result);
        }
    }

    // metode baru hasil Extract Method
    private double convertTime() {
        if (unitType.equalsIgnoreCase("hours")) {
            return value * 60;
        } else if (unitType.equalsIgnoreCase("minutes")) {
            return value * MINUTES_IN_HOUR;
        } else if (unitType.equalsIgnoreCase("seconds")) {
            return value / SECONDS_IN_MINUTE;
        }
        return -1;
    }
}
