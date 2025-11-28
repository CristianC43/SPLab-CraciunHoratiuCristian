package main.java.project;

import java.util.ArrayList;

public class Section implements Element{
	public String name;
	public ArrayList<Element> childrens;
	
	public Section(String name) {
		this.name = name;
		this.childrens = new ArrayList<Element>();
	}
	
	public void add(Element e) {
		this.childrens.add(e);
	}
	
	public void print() {
		System.out.println(this.name);
		for(Element e: this.childrens) {
			e.print();
		}
	}
}
