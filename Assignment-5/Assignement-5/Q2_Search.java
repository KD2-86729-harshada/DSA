package com.sunbeam;

public class Search {
	
	static class Node {
		private int data;
		private Node left, right;
		
		public Node(int value) {
			data = value;
		}
	}
	private Node root;
	
	public Search() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		if(root == null)
			root = new Node(value);
		
		else
			addNode( value, root);
	}

	public void addNode(int value, Node trav) {
		if(value < trav.data) {
			if(trav.left == null) {
				trav.left = new Node(value);
				return;
			}
			else {
				addNode(value, trav.left);
			}
		}
		if(value > trav.data) {
			if(trav.right == null) {
				trav.right = new Node(value);
				return;
			}
			else {
				addNode(value, trav.right);
			}		
		}
	}
	
	public void preOrder(Node trav) {
		if(trav == null)
			return;
		
		else {
			System.out.print(" "+trav.data);
			preOrder(trav.left);
			preOrder(trav.right);
		}
		
	}
	
	public void preOrder() {
		System.out.print("List :");
		preOrder(root);
		System.out.println();
	}
	
	public Node recurssiveSerach(int key, Node trav) {
		if(trav == null)
			return null;
		
		else if(key == trav.data)
			return trav;
		
		else if(key < trav.data)
			return recurssiveSerach(key, trav.left);
		
		else 
			return recurssiveSerach(key, trav.right);
		
	}
	
	public void serach(int value) {
		Node trav = recurssiveSerach(value, root);
		if(trav == null) {
			System.out.println("Element not found......");
		}
		else
		{
			System.out.println("Element found :) ");
		}
		
	}
}
