package graphs;

import java.util.*;

public class MainGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,int[]> graphs = new HashMap<>();
       graphs.put(1, new int[]{2,4});
       graphs.put(2, new int[]{3});
       graphs.put(3, new int[]{4});
       graphs.put(4, new int[]{5});
       graphs.put(5,new int[] {});
       MainGraph maingraph = new MainGraph();
       maingraph.depthFirstStack(graphs, 1);
       System.out.println("----Recu---");
       maingraph.depthFirstStackRec(graphs, 1);
       System.out.println("----BFS---");
       maingraph.breadthFirstSearch(graphs, 1);
	}
	
	public void depthFirstStack(Map<Integer,int[]>graph,int sourceNode) {
		Stack<Integer> stacks = new Stack<>();
		stacks.push(sourceNode);
		while(!stacks.isEmpty()) {
			Integer curNode = stacks.pop();
			System.out.println(curNode);
			for(int child:graph.get(curNode)) {
				stacks.push(child);
			}
		}
	}
	
	public void depthFirstStackRec(Map<Integer,int[]>graph,int sourceNode ) {
		System.out.println(sourceNode);
		for(int child:graph.get(sourceNode)) {
			depthFirstStackRec(graph, child);
		}
	}
	
	public void breadthFirstSearch(Map<Integer,int[]>graph,int sourceNode) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(sourceNode);
		while(!queue.isEmpty()) {
			int curNode = queue.poll();
			System.out.println(curNode);
			for(int child:graph.get(curNode)) {
				queue.add(child);
			}
		}
	}

}
