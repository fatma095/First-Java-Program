public class BookTest {
    public static void main(String[] args) {

        Book myBook = new Book("Java Programming", "John Doe", 1500.00);

        myBook.displayBookInfo();

        System.out.println("Attempting to change price to -500...");
        myBook.setPrice(-500);

        System.out.println("\nBorrowing the book...");
        myBook.borrowBook();
        myBook.displayBookInfo();

        System.out.println("Returning the book...");
        myBook.returnBook();
        myBook.displayBookInfo();
    }
}