package RideRoute_Smart_Transportation_Booking_System_1;

public class PeakFareCalculatorImpl implements IFareCalculator{
    @Override
    public double calculateFare(double baseFare) {
        return baseFare * 1.5;  // 50% surge during peak time
    }
}
