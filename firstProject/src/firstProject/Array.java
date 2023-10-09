package firstProject;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int intarray[]= new int[] {1,2};
      System.out.println(intarray);
      int [][]arr = new int[][] {{1,1},{2,3},{4,5}};
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<2;j++) {
    		   System.out.print(arr[i][j]);
    	   }
    	   System.out.println();
    	   
       }
       
        int jagged[][] = new int[2][];
        jagged[0]=  new int[3];
        jagged[1] = new int[2];
        int count =0;
        for(int i=0;i<jagged.length;i++) {
        	for(int j=0;j<jagged[i].length;j++) {
        		jagged[i][j]=count++;
        	}
        }
        for(int i=0;i<jagged.length;i++) {
        	for(int j=0;j<jagged[i].length;j++) {
        		System.out.print(jagged[i][j]);
        	}
        	System.out.println();
        }
      
	}

}


