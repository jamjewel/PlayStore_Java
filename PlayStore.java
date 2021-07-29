import java.util.ArrayList;

//You may need the following packages
//import java.util.Hashtable;
//import java.util.ArrayList;

public class PlayStore {

	// Instance variables that you need.
	// They must all be marked as private

	// Declare a private variable (array or similar) to store your Content
	// objContentre
	private ArrayList<Content> contentsArray;

	// Declare a private variable (array or similar) to store your User objects
	// here
	private ArrayList<User> usersArray;

	public PlayStore() {
		contentsArray = new ArrayList<Content>();
		usersArray = new ArrayList<User>();
		
	}

	public void addContent(Content content) {
		contentsArray.add(content);
		
	}

	public void addUser(User user) {
		usersArray.add(user);
		
	}

	public void showContent() {
		for (Content c : contentsArray) {
			c.print();
		}
	}
	
	public void showUser() {
		for (User u : usersArray) {
			u.print();
		}
	}
	

	public void showContent(String contentType) {
		for (Content c : contentsArray) {

			if (contentType.equals("Book")) {
				// User wants to print all Books
				if (c.getClass() == Book.class) {
					c.print();
				}

			} else if (contentType.equals("Application")) {
				// User wants to print all Application
				if (c.getClass() == Application.class) {
					c.print();
				}

			} else if (contentType.equals("Publication")) {
				// User wants to print all Publication
				if (c.getClass() == Publication.class) {
					c.print();
				}

			} else if (contentType.equals("All")) {
				// User wants to print all Contents
				c.print();
			}
		}
	}



	public User getUser(String searchUserId) throws Exception {
		for (User u : this.usersArray) {
			if (u.getId().equalsIgnoreCase(searchUserId)) {
				return u;
			}
		}

		throw new Exception("User not found");
	}

	public Content getContent(String searchContentId) throws Exception {
		for (Content c : this.contentsArray) {
			if (c.getId().equalsIgnoreCase(searchContentId)) {
				return c;
			}
		}

		throw new Exception("Content not found");
	}

}