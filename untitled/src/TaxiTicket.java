public class TaxiTicket {
    private String passengerMame;
    private String startLocation;
    private String destination;
    private double price;
    private double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public TaxiTicket(String passengerName, String startLocation, String destination,
                      double price, double duration, double speed) {
        this.passengerMame = passengerName;
        this.startLocation = startLocation;
        this.destination = destination;
        this.price = price;
        this.duration = duration;
        this.speed = speed;
    }

    // Method to check taxi status
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    // Method to display estimated travel duration
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    // Method to display the route
    public void displayRoute() {
        System.out.println("Route: " + startLocation + " -> " + destination);
    }

    // Method to slow down the taxi
    public void sLowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MIN_SPEED)
            speed = MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    // [ Lanjutan dari kode diatas ]

    // Method to speed up the taxi
    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MAX_SPEED)
            speed = MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    // Method to display basic info passenger and trip
    public void calculatedFinalPrice() {
        System.out.println("Passenger Name : " + passengerMame);
        System.out.println("Start Location : " + startLocation);
        System.out.println("Destination : " + destination);
        System.out.println("Price : " + price);
        calculatedFinalPrice(); // Price including 10% tax
    }

    private void calculatedFinalPrice() {
        System.out.println("Final Price : " + (price + (price * 0.1)));
    }

    // Method to display full info including duration and speed
    public void detailedInfo() {
        calculatedFinalPrice();
        System.out.println("Duration : " + duration + " minutes");
        System.out.println("Speed : " + speed + " km/h");
    }

}
