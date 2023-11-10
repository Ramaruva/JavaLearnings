package firstProject;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetpract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NavigableSet<Integer> treeset = new TreeSet<>();
      treeset.add(2);
      treeset.add(34);
      treeset.add(45);
      treeset.add(25);
      for(Integer x:treeset)
    	  System.out.println(x);
      
      System.out.println(treeset.floor(6));
	}

}
