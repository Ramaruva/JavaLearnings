package firstProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * map practice 
 * A map defines mappings  from key to values
 * The <key, value> pair is called 	an enty
 * a map  does not allow duplicate keys, in other words, the keys are unique
 * BOth the keys and the values must be objects, with primitive values being
 * wrapped in their respective primitve wrapper objects when they are put in a map
 * methods 
 * 
 * 
 */
public class Mappract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		map.put("hr", 2);
		map.put("ram", 4);
		map.put("hello", 5);
		System.out.println(map);
		System.out.println(map.getOrDefault("pran",0));
		
		Map<Integer,List<Integer>> adj= new HashMap<>();
		  adj.computeIfAbsent(1, f->new ArrayList<Integer>()).add(1);
		  System.out.println(adj);
		  
		  
		

	}

}
