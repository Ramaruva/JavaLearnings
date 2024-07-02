package linkedlistlearnings;

public class DoubleLinkedList {
	
	Node head;
	Node tail;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head!=null) {
			head.prev = node;
		}
		head = node;
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		node.next=null;
		if(head==null) {
			 head = node;
			 head.prev=null;
			 return;
		}
		while(last.next!=null) {
			last = last.next;
		}
		last.next= node;
		node.prev = last;
	}
	
	public void insert(int after , int val) {
		 Node p = find(after);
		 if(p==null) {
			 System.out.println("does not exist");
			return ; 
		 }
		 Node n = new Node(val);
		 n.next = p.next;
		 p.next = n;
		 n.prev=p;
		 if(n.next!=null) {
			 n.next.prev = n;
		 }
		 
	}
	
	public Node find(int val) {
		 Node node = head;
		 while(node!=null) {
			  if(node.val==val) {
				  return node;
			  }
			  node = node.next;
		 }
		 return null;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
		System.out.print("END");
	}
	

    private class Node{
    	int val;
    	Node next;
    	Node prev;
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		public Node(int val) {
			this.val = val;
		}
    	
    	
    }
}
