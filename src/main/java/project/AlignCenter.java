package main.java.project;

public class AlignCenter implements AlignStrategy{
	
	@Override
	public String render(String text) {
		return "     " + text;
	}

}

