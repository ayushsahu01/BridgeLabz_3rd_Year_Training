public class Q4_HotelBooking {
    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public Q4_HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public Q4_HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public Q4_HotelBooking(Q4_HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Using default constructor
        Q4_HotelBooking booking1 = new Q4_HotelBooking();

        // Using parameterized constructor
        Q4_HotelBooking booking2 = new Q4_HotelBooking("Alice Johnson", "Deluxe", 3);

        // Using copy constructor (clone booking2)
        Q4_HotelBooking booking3 = new Q4_HotelBooking(booking2);

        // Display bookings
        System.out.println("Default Booking:");
        booking1.displayBooking();

        System.out.println("Custom Booking:");
        booking2.displayBooking();

        System.out.println("Copied Booking:");
        booking3.displayBooking();
    }    
}
