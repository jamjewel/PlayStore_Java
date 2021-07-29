import java.util.ArrayList;

public abstract class Content {
	// Instance Variables (Data Members)
	private String id;
	private String name;
	private int numberOfDownloads;
	private double price;
	private ArrayList<Comment> review;
	
    //Constructor to initialize  content at its birth.
	protected Content(String id, String name) {
		this.id = id;
		this.name = name;
		this.numberOfDownloads = 0;
		this.review = new ArrayList<Comment>();

	}
    
    //Constructor to initialize  content
	protected Content(String id, String name, double price) {
		this(id, name);
		this.price = price;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfDownloads() {
		return numberOfDownloads;
	}

	public void setNumberOfDownloads(int numberOfDownloads) {
		this.numberOfDownloads = numberOfDownloads;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Comment> getReview() {
		return review;
	}

	public void setReview(ArrayList<Comment> review) {
		this.review = review;
	}

	public void print() {
		System.out.println("ID=" + this.id);
		System.out.println("Name=" + this.name);
		System.out.println("Price=" + this.price);
	}

	public void addReview(Comment com) throws Exception {
		if (!com.getComment().isEmpty()) {
			this.review.add(com);
		} else {
			throw new Exception("Cannot add an empty comment");
		}
	}

	public void showReviews() {
		for (Comment c : this.review) {
			System.out.println("Comment: " + c.getComment());
			System.out.println("By: " + c.getUser().getName());
		}
	}

}
