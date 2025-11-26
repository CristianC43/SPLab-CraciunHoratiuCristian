package project;

public class Table implements Element{
	public String title;
	public Table(String title) {
		this.title = title;
	}
	public void print() {
		System.out.println(this.title);
	}
}
