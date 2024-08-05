package recursion;

public class RecursionPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // permutation("", "abc");
		//pad("","12");
		dice("", 4);
	}
	
	static void permutation(String p,String up) {
		 if(up.isEmpty()) {
			 System.out.println(p);
			 return;
		 }
		 char ch = up.charAt(0);
		 for(int i=0;i<=p.length();i++) {
			 String f = p.substring(0,i);
			 String s = p.substring(i,p.length());
			 permutation(f+ch+s, up.substring(1));
		 }
	}
	 
	static void pad(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit = up.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch = (char)('a'+i);
			pad(p+ch,up.substring(1));
		}
	}
   
	static void dice(String p, int target) {
		if(target==0) {
			System.out.println(p);
			return;
		}
		for(int i=1;i<=6&&i<=target;i++) {
			 dice(p+i,target-i);
		}
	}
}
