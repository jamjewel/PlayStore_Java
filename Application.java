
public class Application extends Content {
    // Instance Variables
	private String osType;

	// Contructor for priced applications
	public Application(String id, String name, double price, String osType) {
		super(id, name, price);
		this.osType = osType;
	}

	// Contructor for free applications
	public Application(String id, String name, String osType) {
		super(id, name);
		this.osType = osType;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
}
