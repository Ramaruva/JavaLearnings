package firstProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listspract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> alist = new ArrayList<>();
       alist.add(1);
       alist.add(2);
       alist.add(3);
       System.out.println(alist);
       System.out.println("the new element replaced ="+alist.set(2, 200));
       System.out.println(alist);
       List<Integer> alist2 = new ArrayList<>();
       //in above we can give another collection
       //such that whatever values are present in alist it will be copied into alist2
       alist2.add(300);
       alist2.addAll(alist);
       System.out.println(alist2);
       
       for(int x:alist)
    	   System.out.println(x);
       
       System.out.println(alist.indexOf(3));
       
        List<Integer> aliste3 = alist.subList(1, 2);
        aliste3.add(5);
        aliste3.add(10);
        aliste3.add(11);
        aliste3.add(12);
        System.out.println(alist);
        System.out.println(aliste3);
        
        
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(33);
        linkedlist.add(233);
        linkedlist.add(334);
        ListIterator<Integer> iterator = linkedlist.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.nextIndex());
        
	}
  //lists has arraylist,linkedlist and vector
}
