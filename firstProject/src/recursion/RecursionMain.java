package recursion;

public class RecursionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fun(5);
        System.out.println(fact(5));
        System.out.println(helper(102000,0));
	}
    static void fun(int n) {
    	 if(n==0) {
    		 return ;
    	 }
    	 fun(n-1);
    	 System.out.println(n);
    }
    static int fact(int n) {
    	if(n==1) {
    		return 1;
    	}
    	return n*fact(n-1);
    }
    
    private static int helper(int n, int c) {
    	 if(n==0) {
    	    return c;	 
    	 }
    	 int rem = n%10;
    	 if(rem==0) {
    		 c++;
    	 }
    	 return helper(n/2,c);
    }
}
