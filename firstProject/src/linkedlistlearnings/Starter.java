package linkedlistlearnings;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SingleLinkedList list = new SingleLinkedList();
          list.insertFirst(1);
          list.insertFirst(2);
          list.insertFirst(3);
          list.insertFirst(4);
          list.insertLast(99);
          list.insert(100, 3);
//          list.display();
//          System.out.println(list.deleteFirst());
//          System.out.println(list.deleteLast());
          
          DoubleLinkedList dl = new DoubleLinkedList();
          dl.insertFirst(10);
          dl.insertFirst(29);
          dl.insertFirst(34);
          dl.insertLast(25);
          dl.insert(29, 31);
         // dl.display();
          
          CircularLinkedlist cl = new CircularLinkedlist();
          cl.insert(23);
          cl.insert(14);
          cl.insert(15);
          cl.insert(16);
          cl.display();
	}

}
