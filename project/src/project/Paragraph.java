package project;

public class Paragraph extends Element{
	public String text;
	public Paragraph(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println(this.text);
	}
}
