package project;

public class Author {
	public String name;
	public Book[] books;
	
	public Author(String name, Book[] books) {
		this.name = name;
		for(int i = 0; i < books.length; i++) {
			this.books[i] = books[i];
		}
	}
	void print() {
		System.out.println("Metoda Author");
	}
		
}
