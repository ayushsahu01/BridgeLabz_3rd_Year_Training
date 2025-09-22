package RideRoute_Smart_Transportation_Booking_System_1;

public class Car extends Vehicle{
    public Car(double speed, double baseFarePerKm) {
        super(speed, baseFarePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Cars may include an extra service charge
        return (baseFarePerKm * distance) + 20;
    }
}
