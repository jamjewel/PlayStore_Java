import java.util.ArrayList;

//Book class inherits from Publication
public class Book extends Publication {
	private ArrayList<String> authors;

	public Book(String id, String name, double price, String publisher, int noOfPages, String[] authors) {
		super(id, name, price, publisher, noOfPages);
		this.authors = new ArrayList<String>();
		for (int i = 0; i < authors.length; i++) {
			this.authors.add(authors[i]);

		}
	}
}
