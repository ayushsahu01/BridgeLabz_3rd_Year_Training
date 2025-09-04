public class Q1_Book {
    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    public Q1_Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Q1_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : $" + price);
        System.out.println("-----------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Q1_Book defaultBook = new Q1_Book();

        // Using parameterized constructor
        Q1_Book customBook = new Q1_Book("Java Programming", "James Gosling", 499.99);

        // Displaying details
        defaultBook.displayBookDetails();
        customBook.displayBookDetails();
    }
}
