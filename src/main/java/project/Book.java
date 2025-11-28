package main.java.project;

import java.util.ArrayList;

public class Book {
	public String title;
	public ArrayList<Author> authors;
	public ArrayList<Element> elements;
	
	public Book(String title) {
		this.title = title;
		this.authors = new ArrayList<Author>();
		this.elements= new ArrayList<Element>();
	}
	
	void addAuthor(Author a) {
		this.authors.add(a);
	}
	
	void addContent(Element e) {
		elements.add(e);
	}
	
	public void print() {
		System.out.println(this.title);
		System.out.println(this.authors);
		for(Element e: elements) {
			e.print();
		}
	}
}
	