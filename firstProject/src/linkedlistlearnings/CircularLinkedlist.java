package linkedlistlearnings;

public class CircularLinkedlist {
	 private Node head;
	 private Node tail;
	 
	 
	 public void insert(int val) {
		 Node node = new Node(val);
		 if(head==null) {
			 head=node;
			 tail = node;
		 }
		 tail.next = node;
		 node.next = head;
		 tail = node;
	 }
	 public void display() {
		 Node node = head;
		 if(head!=null) {
			 do {
				 System.out.print(node.val+"-->");
				 node = node.next;
			 }while(head!=node);
		 }
	 }
	 
	 public void delete(int val) {
		 Node node = head;
		 if(node==null) {
			 return;
		 }
		 if(node.val==val) {
			 head= head.next;
			 tail.next = head;
			 return;
		 }
		 do {
			 Node n = node.next;
			 if(n.val==val) {
				 node.next = n.next;
				 break;
			 }
			 node = node.next;
		 }while(node!=head);
	 }
	private class Node{
		int val;
		Node next;
		public Node(int val, Node next) {
			super();
			this.val = val;
			this.next = next;
		}
		public Node(int val) {
			super();
			this.val = val;
		}
		
	}

}
