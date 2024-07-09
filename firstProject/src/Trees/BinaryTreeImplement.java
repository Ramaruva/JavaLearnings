package Trees;

import java.util.Scanner;

public class BinaryTreeImplement {

	private static class Node{
		int value;
		Node right,left;
		Node(int value){
			this.value = value;
		}
	}
	
	private Node root;
	
	public void populate(Scanner scan) {
		System.out.println("Enter the root node value");
		int val = scan.nextInt();
		root = new Node(val);
		populate(scan,root);
	}
	
	public void populate(Scanner scan, Node node) {
		System.out.println("Do you want to enter left of "+node.value);
		boolean left = scan.nextBoolean();
		if(left) {
			System.out.println("Enter the value of the left of"+node.value);
			int leftVal = scan.nextInt();
			node.left = new Node(leftVal);
			populate(scan,node.left);
		}
		System.out.println("Do you want to enter right of"+node.value);
		boolean right = scan.nextBoolean();
		if(right) {
			System.out.println("Enter the value of the right of"+node.value);
			int rightVal = scan.nextInt();
			node.right = new Node(rightVal);
			populate(scan,node.right);
		}
	}
	public void display() {
		display(this.root,"");
	}
	public void display(Node node,String indent) {
		if(node==null) 
			return;
		System.out.println(indent+node.value);
		display(node.left,indent+"\t");
		display(node.right,indent+"\t");
	}
}
