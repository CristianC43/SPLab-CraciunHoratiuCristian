package project;

public class Book {
	public String title;
	public Chapter[] chapters;
	public Author author;
	
	public Book(String title, Chapter[] chapters, Author author) {
		this.title = title;
		this.chapters = chapters;
		this.author = author;
	}
	
	public void print() {
		for(Chapter ch: chapters) System.out.println(ch);

	}
}
