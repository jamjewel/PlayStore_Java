
public class Comment {
// Instance Variables

	private User user;
	private String comment;

	public Comment(User u, String c) {
		this.user = u;
		this.comment = c;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
