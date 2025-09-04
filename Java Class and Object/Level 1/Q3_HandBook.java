public class Q3_HandBook {
    //Declaring the variables to get the details of hand book
	String bookTitle;
	String bookAuthor;
	double price;
	
	//constructor
	Q3_HandBook(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	//creating the method to display the output
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	
	public static void main(String[] args) {
	Q3_HandBook book1= new Q3_HandBook("2States", "Chetan Bhagat", 500);
	Q3_HandBook book2=new Q3_HandBook("Wings Of Fire","Abdul kalam.A.P.J",  500);
	book1.displayBookDetails();
	book2.displayBookDetails();
	}

}
