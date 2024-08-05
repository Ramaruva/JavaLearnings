package recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,8,4,4,4,5,6};
		System.out.println(sorted(arr,0));
		System.out.println(find(arr,2,0));
		ArrayList<Integer> ans = new ArrayList<>();
		findAllIndex(arr, 4, 0, ans);
		System.out.println(ans);
	}
	static boolean sorted(int[] arr, int index) {
		 if(index==arr.length-1) {
			 return true;
		 }
		 return arr[index]<arr[index+1] && sorted(arr,index+1);
	}
	 
   static boolean find(int[] arr, int target, int index) {
	   if(index==arr.length) {
		   return false;
	   }
	   return arr[index]==target || find(arr,target,index+1);
   }
   
   static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
	   if(index==arr.length) {
		   return list;
	   }
	   if(arr[index]==target) {
		   list.add(index);
	   }
	   return findAllIndex(arr,target,index+1,list);
   }
   
   static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
	   ArrayList<Integer> list = new ArrayList<>();
	   if(index==arr.length) {
		   return new ArrayList<>();
	   }
	   if(arr[index]==target) {
		   list.add(index);
	   }
	   ArrayList<Integer> ansfromcalls = findAllIndex2(arr,target,index+1);
	   list.addAll(ansfromcalls);
	   return list;
   }
   
   
}
