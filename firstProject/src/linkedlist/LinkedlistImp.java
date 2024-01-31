package linkedlist;

public class LinkedlistImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Node y = new Node(1);
      System.out.println(y.data);
      int [] arr = {4,2,34,5};
      Node head = convertArr2l(arr);
      System.out.println(head.data);
      Node temp = head;
      	while(temp!= null) {
      		System.out.println(temp.data+"");
      		temp = temp.next;
      	}
      	
      	DoubleLinkedList dl = new DoubleLinkedList();
      	dl.insertFirst(0);
      	dl.insertFirst(2);
      	dl.insertFirst(3);
      	dl.insertFirst(4);
      	dl.insertFirst(6);
      	dl.insertLast(8);
      	dl.Display();
     
	}
	
	private static Node convertArr2l(int [] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1; i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

}

 class Node{
	int data;
	Node next;
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

