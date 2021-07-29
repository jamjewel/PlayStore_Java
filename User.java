import java.util.ArrayList;

public class User {
	// Instance Variables

	private String id;
	private String name;
	private String phoneNumber;
	private double availableFunds;
	private boolean isPremium;
	private ArrayList<Content> boughtContents;

	public User(String id, String n, String phNo) {
		this.id = id;
		this.name = n;
		this.phoneNumber = phNo;
		this.availableFunds = 500;
		this.isPremium = false;
		boughtContents = new ArrayList<Content>();
	}

	public User(String id, String n, String phNo, double balance) {
		this.id = id;
		this.name = n;
		this.phoneNumber = phNo;
		this.availableFunds = balance;
		this.isPremium = false;
		boughtContents = new ArrayList<Content>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public double getAvailableFunds() {
		return availableFunds;
	}

	public boolean isPremium() {
		return isPremium;
	}

	// Instance Methods
	public void becomePremium() throws Exception {
		if (isPremium) {

			throw new Exception("You are already a Premium member");
		}

		if (availableFunds >= 100) {
			availableFunds = availableFunds - 100;
			isPremium = true;
			System.out.println("Upgraded to premium");

		} else {
			throw new Exception("No Sufficient Funds to become Premium");
		}
	}
	
	public void print() {
		System.out.println("ID=" + this.id);
		System.out.println("Name=" + this.name);
		
	}
	

	public void buyContent(Content c) throws Exception {
		double amountRequired;
		if (isPremium) {
			amountRequired = c.getPrice() * 0.80;
		} else {
			amountRequired = c.getPrice();
		}

		if (this.availableFunds >= amountRequired) {
			// Buy the Content
			this.availableFunds = this.availableFunds - amountRequired;
			c.setNumberOfDownloads(c.getNumberOfDownloads() + 1);
			boughtContents.add(c);
			System.out.println("Item purchased Successfully");
		} else {
			throw new Exception("No Sufficient Funds to buy the content");
		}
	}
	

	public void showBoughtContent() {
		for (Content c : this.boughtContents) {
			System.out.println(c.getName());
		}
	}
}
