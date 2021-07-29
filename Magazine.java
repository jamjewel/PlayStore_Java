
public class Magazine extends Publication {
	private int volume;

	public Magazine(String id, String name, double price, String publisher, int noOfPages, int volume) {
		super(id, name, price, publisher, noOfPages);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
