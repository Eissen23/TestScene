public class Book {
	
	private String name;
	private	String author;
	private int numberOfPage;
	
	Book(){}

	Book(String name, String author, int numberOfPage){
		this.name = name;
		this.author = author;
		this.numberOfPage = numberOfPage;
	}
	
	public void setName(String name){
		this.name = name.trim();
	}

	public void setAuthor(String author){
		this.author = author.trim();
	}
	
	public void setNumber(int nbrPage){
		this.numberOfPage = nbrPage;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPage() {
		return this.numberOfPage;
	}
	
}