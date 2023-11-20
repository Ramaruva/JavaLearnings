package firstProject;

import java.util.Stack;

/*
 * A stack is a one-ended linear data
 * structure which models a real
 * world stack by having two primary 
 * operations push and pop
 * 	
 */

/*
 * when and where is a stack used
 *   --> Used by undo mechanisms in text editiors
 *   --> Used in compiler syntax checking for matching brackets and braces
 *    --> can be used to model a pile of books or plates
 *    --> Used behind the scenes to support recursion by keep tracking of prev func calls
 *    -->can be used to do a depth first search(DFS) on a graph
 */
public class StacksImplenet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		stack.push("ram");
		stack.push("hello");
		stack.push("heyy");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		if(!stack.isEmpty()) {
			stack.pop();
			/*
			 * make sure to use pop operation before checking stack empty or not
			 */
			stack.pop();
		}
		
		System.out.println(stack);
		

	}

}
