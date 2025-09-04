public class Q5_Book {
     // Attributes
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    public Q5_Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false; // mark as borrowed
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating book objects
        Q5_Book book1 = new Q5_Book("Java Programming", "James Gosling", 499.99, true);
        Q5_Book book2 = new Q5_Book("Clean Code", "Robert C. Martin", 299.99, true);

        // Display books
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Borrow books
        book1.borrowBook(); // should succeed
        book1.borrowBook(); // should fail (already borrowed)

        // Display updated availability
        book1.displayBookDetails();
    }    
}
