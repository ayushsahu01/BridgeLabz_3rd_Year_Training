public class Q3_Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (common for all vehicles)
    static double registrationFee = 5000.0; // default fee

    // Constructor
    public Q3_Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("-----------------------------");
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("✅ Registration Fee updated to: ₹" + registrationFee);
        System.out.println("=============================");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating vehicle objects
        Q3_Vehicle v1 = new Q3_Vehicle("Arjun Mehta", "Car");
        Q3_Vehicle v2 = new Q3_Vehicle("Sneha Gupta", "Bike");
        Q3_Vehicle v3 = new Q3_Vehicle("Rohit Sharma", "Truck");

        // Display details with default registration fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();

        // Update registration fee
        Q3_Vehicle.updateRegistrationFee(7000);

        // Display details again (with updated fee)
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
    }    
}
