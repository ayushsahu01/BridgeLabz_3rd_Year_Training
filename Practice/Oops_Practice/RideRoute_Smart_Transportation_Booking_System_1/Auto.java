package RideRoute_Smart_Transportation_Booking_System_1;

public class Auto extends Vehicle{
    public Auto(double speed, double baseFarePerKm) {
        super(speed, baseFarePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Auto may have a minimum fare
        double fare = baseFarePerKm * distance;
        return Math.max(fare, 30);
    }
}
