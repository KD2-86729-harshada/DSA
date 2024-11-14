package com.sunbeam;

public class SinglyCircularListMain {

	public static void main(String[] args) {
		SinglelyCircular s = new SinglelyCircular();
//		s.addFirst(10);
//		s.addFirst(20);
//		s.addFirst(30);
//		s.addFirst(40);
//		s.addFirst(50);
		
		s.addLast(60);
		s.addLast(70);
		s.addLast(80);
		
		s.addPostion(90, 2);

		s.disply();
	}

}
