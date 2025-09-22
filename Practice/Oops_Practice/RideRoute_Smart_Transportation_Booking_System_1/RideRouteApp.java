package RideRoute_Smart_Transportation_Booking_System_1;

public class RideRouteApp {
    public static void main(String[] args) {
        double distance = 10; // km

        // Create different vehicle objects (Polymorphism)
        Vehicle bike = new Bike(40, 5);
        Vehicle car = new Car(60, 12);
        Vehicle auto = new Auto(50, 8);

        System.out.println(bike.getDetails() + " | Fare: ₹" + bike.calculateFare(distance));
        System.out.println(car.getDetails() + " | Fare: ₹" + car.calculateFare(distance));
        System.out.println(auto.getDetails() + " | Fare: ₹" + auto.calculateFare(distance));

        // Apply dynamic pricing using Interface
        IFareCalculator peakCalculator = new PeakFareCalculatorImpl();
        double surgeFare = peakCalculator.calculateFare(car.calculateFare(distance));
        System.out.println("Car Fare with Surge Pricing: ₹" + surgeFare);
    }
}
