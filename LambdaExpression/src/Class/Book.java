package Class;

public class Book {
	private String title;
	private String authorFName;
	private String authorLName;
	private int price;

	public Book(String title, String authorFName, String authorLName, int price) {
		this.title = title;
		this.authorFName = authorFName;
		this.authorLName = authorLName;
		this.price = price;
		
		
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorFName() {
		return authorFName;
	}

	public String getAuthorLName() {
		return authorLName;
	}

	public int getPrice() {
		return price;
	}
}
