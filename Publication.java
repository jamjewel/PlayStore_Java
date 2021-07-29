
public class Publication extends Content {
	private String publisher;
	private int noOfPages;

	public Publication(String id, String name, double price, String publisher, int noOfPages) {
		super(id, name, price);
		this.publisher = publisher;
		this.noOfPages = noOfPages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public void print() {
		System.out.println("id=" + this.getId());
		System.out.println("name=" + this.getName());
	}
}
