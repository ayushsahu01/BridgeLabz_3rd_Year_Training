public class Q2_LibrarySystem {
    public static void main(String[] args) {
        // Create a normal Book
        Book book1 = new Book("ISBN-12345", "Java Programming", "James Gosling");
        book1.displayBookDetails();

        // Update author name using setter
        book1.setAuthor("Updated Author");
        System.out.println("Updated Author: " + book1.getAuthor());
        System.out.println();

        // Create an EBook
        EBook ebook1 = new EBook("ISBN-67890", "Advanced Java", "Oracle", 5.6);
        ebook1.displayEBookDetails();
    }
}

class Book {
    public String ISBN;        // public → accessible everywhere
    protected String title;    // protected → accessible in subclasses
    private String author;     // private → only accessible via methods

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display method
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("-----------------------------");
    }
}

// Subclass
class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Demonstrating access to public & protected variables
    public void displayEBookDetails() {
        System.out.println("EBook ISBN  : " + ISBN);   // public accessible
        System.out.println("EBook Title : " + title);  // protected accessible
        System.out.println("EBook Author: " + getAuthor()); // private via getter
        System.out.println("File Size   : " + fileSizeMB + " MB");
        System.out.println("=============================");
    }
}