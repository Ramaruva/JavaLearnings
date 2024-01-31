package linkedlist;

public class DoubleLinkedList {
    DoubleNode head;
    
    public void insertFirst(int val) {
    	DoubleNode node = new DoubleNode(val);
    	node.next = head;
    	node.prev = null;
    	if(head!=null) {
    		head.prev = node;
    	}
    	head=node;	
    }
    
    @SuppressWarnings("null")
	public void insertLast(int val) {
    	DoubleNode newNode = new DoubleNode(val);
    	DoubleNode last = head;
    	newNode.next = null;
    	
    	if(head == null) {
    		newNode.prev = null;
    		head = newNode;
    		return;
    	}
    	while(last!=null) {
    		last = last.next;
    	}
    	last.next = newNode;
    	
    }
    
    public void Display() {
    	DoubleNode node = head;
    	while(node != null)
    	{
    		System.out.print(node.val+"-->");
    		node = node.next;
    	}
    	System.out.print("End");
    }
}


class DoubleNode{
	int val;
	DoubleNode next;
	DoubleNode prev;
	public DoubleNode(int val) {
		this.val = val;
	}
	public DoubleNode(int val, DoubleNode next, DoubleNode prev) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}
	
	
}