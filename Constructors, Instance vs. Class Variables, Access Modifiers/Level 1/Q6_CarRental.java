public class Q6_CarRental {
     // Attributes
    String customerName;
    String carModel;
    int rentalDays;

    // Default constructor
    public Q6_CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public Q6_CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        double dailyRate;

        // Rate based on car model
        switch (carModel.toLowerCase()) {
            case "sedan":
                dailyRate = 2000; // ₹2000/day
                break;
            case "suv":
                dailyRate = 3000; // ₹3000/day
                break;
            case "luxury":
                dailyRate = 5000; // ₹5000/day
                break;
            default:
                dailyRate = 1500; // Standard rate
        }

        return dailyRate * rentalDays;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println("-----------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Q6_CarRental rental1 = new Q6_CarRental();

        // Using parameterized constructor
        Q6_CarRental rental2 = new Q6_CarRental("Rahul Sharma", "SUV", 5);
        Q6_CarRental rental3 = new Q6_CarRental("Anita Verma", "Luxury", 3);

        // Display rentals
        rental1.displayRentalDetails();
        rental2.displayRentalDetails();
        rental3.displayRentalDetails();
    }    
}
