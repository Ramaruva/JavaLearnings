package firstProject;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queuepract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is FIFO
      Queue<Integer> qu = new LinkedList<Integer>();
       qu.add(1);
       qu.add(2);
       qu.add(4);
       qu.add(5);
       System.out.println(qu);
       System.out.println(qu.peek());
       System.out.println(qu.poll());
       System.out.println(qu.peek());
       
       Stack<String> s = new Stack<>();
       
       s.push("Ram");
       s.push("Pranita");
       while(!s.isEmpty())
       {
    	   System.out.println(s.peek());
    	   s.pop();
       }
       
       Deque<Integer> dq = new ArrayDeque<Integer>();
       dq.offerFirst(2);
       dq.offerFirst(4);
       dq.offerLast(3);
       System.out.println(dq);
       System.out.println(dq.pollFirst());
       System.out.println(dq.pollLast());
       System.out.println(dq);
       
       //
       PriorityQueue<Integer> prqor = new PriorityQueue<Integer>();
       prqor.offer(1);
       prqor.offer(2);
       prqor.offer(200);
      
       
	}
	
	//Deque
	//
	
	//Priority Queue
	//Priority queue  works on priority
	//The implementation is based on a priority heap, a tree like structure that yeilds an element at
	// the head of the qeue according to the priority according to the priority ordering, which is definde
	// either by the natural ordering of its element or by a comparator.
	//In the case of several elements having the same priority, one of them is chosen arbitraily 
	

}
