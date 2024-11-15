package com.sunbeam;

public class SerachMain {
	public static void main(String[] args) {
		Search s = new Search();
		s.addNode(50);
		s.addNode(60);
		s.addNode(40);
		s.addNode(10);
		s.addNode(45);
		s.addNode(80);
		
		s.preOrder();
		
//		s.recurssiveSerach(45, null);
		s.serach(45);
	}
}
