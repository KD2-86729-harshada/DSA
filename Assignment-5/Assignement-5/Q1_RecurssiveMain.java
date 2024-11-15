package com.sunbeam;

public class RecurssiveMain {

	public static void main(String[] args) {
		Recusrsive r = new Recusrsive();
		r.addNode(50);
		r.addNode(60);
		r.addNode(10);
		r.addNode(20);
		r.addNode(30);
		
		r.inOrder();
	}

}
