package binarySearch;

import java.util.Arrays;

public class BinaryClassImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int array[] = new int[100];
          int target=42;
          for(int i=0;i<array.length;i++) {
        	  array[i]=i;
          }
          int index= binarySearch(array, target);
          if(index==-1) System.out.println("Element Not found");
          else System.out.println(array[index]);
	}

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		int low=0;
		int high=array.length-1;
		while(low<=high) {
			int middle = low+(high-low)/2;
			int val= array[middle];
			System.out.println(val);
			if(val<target)low=middle+1;
			else if(val>target)high=middle-1;
			else return middle;
		}
		return -1;
	}

}
