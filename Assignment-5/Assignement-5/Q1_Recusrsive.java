package com.sunbeam;

public class Recusrsive {
	static class Node{
		private int data;
		private Node left, right;
		
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;
	
	public Recusrsive() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		if(root == null)
			root = new Node(value);
		
		else
			addNode(value, root);
	}

	//to add node
	public void addNode(int value, Node trav) {
		if(value < trav.data) {
			if(trav.left == null) {
				trav.left = new Node(value);
				return;
			}
			else 
				addNode(value, trav.left);
		}
			
		if(value > trav.data) {
			if(trav.right == null)
			{
				trav.right = new Node(value);
				return;
			}
				
			else
				addNode(value, trav.right);
		}
	}
	
	public void inOrder(Node trav) {
	
		if(trav == null)
			return;
		
		else {
			inOrder(trav.left);
			System.out.print(" "+trav.data);
			inOrder(trav.right);
		}
	}
	
	public void inOrder() {
		inOrder(root);
	}
}
