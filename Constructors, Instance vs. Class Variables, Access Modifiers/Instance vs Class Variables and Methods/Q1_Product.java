public class Q1_Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared among all products)
    static int totalProducts = 0;

    // Constructor
    public Q1_Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment count whenever new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("-----------------------------");
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
        System.out.println("=============================");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating products
        Q1_Product p1 = new Q1_Product("Laptop", 55000);
        Q1_Product p2 = new Q1_Product("Smartphone", 25000);
        Q1_Product p3 = new Q1_Product("Headphones", 2000);

        // Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products created
        Q1_Product.displayTotalProducts();
    }    
}
