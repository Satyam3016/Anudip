

public class Main {

	public static void main(String[] args) {
		// First instance using setter methods
        Book book1 = new Book();
        book1.setBookId(101);
        book1.setTitle("Java Programming");
        book1.setAuthor("Satyam");
        book1.setPrice(545.5);

        // Second instance using parameterized constructor
        Book book2 = new Book(102, "Data Structures", "Alok", 612.2);

        // Printing the values of both objects
        System.out.println("Book 1 Details: " + book1);
        System.out.println("Book 2 Details: " + book2);

	}

}
