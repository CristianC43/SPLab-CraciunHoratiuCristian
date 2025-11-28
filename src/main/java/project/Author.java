package main.java.project;

public class Author {
	public String name;
	public String surname;
	
	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void print() {
		System.out.print(this.name + " " + this.surname);
	}
		
}
