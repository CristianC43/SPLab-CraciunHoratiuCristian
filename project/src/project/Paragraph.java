package project;

public class Paragraph implements Element{
	public String text;
	
	public Paragraph(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println(this.text);
	}
	
	public void setAlignStrategy(AlignStrategy context) {
		this.text = context.render(this.text);
	}
}
