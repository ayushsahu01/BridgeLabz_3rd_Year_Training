public class Q2_Circle {
    // Attribute
    double radius;

    // Default constructor → calls parameterized constructor
    public Q2_Circle() {
        this(1.0); // default radius = 1.0
    }

    // Parameterized constructor
    public Q2_Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display method
    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Using default constructor
        Q2_Circle defaultCircle = new Q2_Circle();

        // Using parameterized constructor
        Q2_Circle customCircle = new Q2_Circle(5.5);

        // Display details
        defaultCircle.displayCircleDetails();
        customCircle.displayCircleDetails();
    }    
}
