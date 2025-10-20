package Task2;

public class TaxiTicket extends Ticket implements Operational {
    private double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public TaxiTicket(TicketInfo ticketInfo) {
        super(ticketInfo.passengerName(), ticketInfo.startLocation(), ticketInfo.destination(), ticketInfo.price());
        this.duration = ticketInfo.duration();
        this.speed = ticketInfo.speed();
    }

    // Method to check taxi status
    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    // Method to display estimated travel duration
    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    // Method to display the route
    @Override
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
    @Override
    public void displayInfo() {//
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Start Location : " + startLocation);
        System.out.println("Destination : " + destination);
        System.out.println("Price : " + price);
        calculateFinalPrice(); // Price including 10% tax
    }

    private void calculateFinalPrice() {
        System.out.println("Final Price : " + (price + (price * 0.1)));
    }

    // Method to display full info including duration and speed
    public void detailedInfo() {
        displayInfo();
        System.out.println("Duration : " + duration + " minutes");
        System.out.println("Speed : " + speed + " km/h");
    }

    public static void main(String[] args) {
        TaxiTicket ticket = new TaxiTicket(new TicketInfo("Alice", "Downtown", "Airport", 50.0, 30.0, 60.0));

        ticket.detailedInfo(); // Display full info

        ticket.checkStatus(); // Check taxi status

        // Display route and estimated duration
        ticket.displayRoute();
        ticket.displayEstimatedDuration();

        // Simulate slowing down and speeding up
        ticket.sLowDown(20);
        ticket.speedUp(15);
    }
}

//376