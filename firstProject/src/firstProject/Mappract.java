package firstProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

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
		  //commit
		  
		   NavigableMap<Integer, String> tmap = new TreeMap<Integer, String>((a,b)->a-b);
		   tmap.put(1, "pranita");
		   tmap.put(2,"gowtham");
		   tmap.put(3, "jaya");
		   System.out.println(tmap);
		

	}

}

/*
 *Tree Map:
 *The TreeMap class implements the navigableMap interface, and thereby the sortedMap Interface
 *By default, operations on sorted map rely on the natural ordering of the keys
 *however, a total ordering can be specified by passing a customized comparator to constructor
 *The treemap implementation uses balanced trees, which deliver excellent perfomance for all operations
 *However, searching in a hashmap can be faster than in a treemap, as hashing algorithms 
 *usually offer better perfomance than the search algo for balanced trees
 *
 */
