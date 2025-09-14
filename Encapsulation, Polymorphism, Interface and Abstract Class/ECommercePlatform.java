// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Display method
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
    }
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private int warrantyYears;

    public Electronics(int productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST";
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5% GST";
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
    }
}

// Groceries class
class Groceries extends Product {
    private double weightKg;

    public Groceries(int productId, String name, double price, double weightKg) {
        super(productId, name, price);
        this.weightKg = weightKg;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Weight: " + weightKg + " kg");
    }
}

public class ECommercePlatform {
    // Method to calculate and print final price
    public static void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable taxableProduct = (Taxable) product;
            tax = taxableProduct.calculateTax();
            System.out.println(taxableProduct.getTaxDetails());
        }

        double finalPrice = product.getPrice() + tax - discount;

        product.displayProductDetails();
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Product laptop = new Electronics(201, "Laptop", 60000, 2);
        Product tshirt = new Clothing(202, "T-Shirt", 1500, "L");
        Product rice = new Groceries(203, "Rice", 800, 10);

        Product[] products = {laptop, tshirt, rice};

        // Polymorphism in action
        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}
