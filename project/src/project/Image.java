package project;

public class Image extends Element{
	public String imageName;
	public Image(String imageName) {
		this.imageName = imageName;
	}
	public void print() {
		System.out.println(this.imageName);
	}
}
