package RideRoute_Smart_Transportation_Booking_System_1;

public abstract class Vehicle {
    protected double speed;
    protected double baseFarePerKm;

    public Vehicle(double speed, double baseFarePerKm) {
        this.speed = speed;
        this.baseFarePerKm = baseFarePerKm;
    }

    // Abstract method to enforce custom fare logic
    public abstract double calculateFare(double distance);

    public String getDetails() {
        return this.getClass().getSimpleName() + 
               " | Speed: " + speed + " km/h | Base Fare/Km: ₹" + baseFarePerKm;
    }
}
