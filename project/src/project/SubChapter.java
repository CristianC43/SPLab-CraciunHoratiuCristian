package project;

public class SubChapter {
	public String name;
	public Element[] elements;
	
	public SubChapter(String name, Element[] elements) {
		this.name = name;
		this.elements = elements;
	}
	
	public void print() {
		for(Element el: elements) System.out.println(el);
	}
}
