package project;

public class Chapter {
	public String name;
	public SubChapter[] subchapters;
	
	public Chapter(String name, SubChapter[] subchapters) {
		this.name = name;
		this.subchapters = subchapters;
	}
	
	public void print() {
		for(SubChapter sub: subchapters) System.out.println(sub);
	}
}
