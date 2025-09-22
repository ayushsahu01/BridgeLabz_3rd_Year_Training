package RideRoute_Smart_Transportation_Booking_System_1;

public class Bike extends Vehicle{
    public Bike(double speed, double baseFarePerKm) {
        super(speed, baseFarePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFarePerKm * distance;
    }
}
