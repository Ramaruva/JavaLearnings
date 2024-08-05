package backtracking;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(count(3,3));
        // path("",3,3);
         boolean[][] board = {
        		 {true,true,true},
        		 {true,true,true},
        		 {true,true,true}
         };
       // pathRestrict("", board, 0, 0);
        allPaths("", board, 0, 0);
	}
	
	static int count(int r, int c) {
		if(r==1||c==1) {
			return 1;
		}
		int left = count(r-1,c);
		int right = count(r,c-1);
		return left+right;
	}

	static void path(String p, int r, int c) {
		if(r==1&&c==1) {
			System.out.println(p);
			return;
		}
		if(r>1) {
			path(p+'V',r-1,c);
		}
		if(c>1) {
			path(p+'H',r,c-1);
		}
		if(r>1&&c>1) {
			path(p+"D",r-1,c-1);
		}
	}
	
	static void pathRestrict(String p, boolean[][] maze, int r, int c) {
		if(r==maze.length-1&&maze[0].length-1==c) {
		    System.out.println(p);
		    return;
		}
		if(!maze[r][c]) {
			return;
		}
		if(r<maze.length-1) {
			pathRestrict(p+'D', maze, r+1, c);
		}
		if(c<maze[0].length-1) {
			pathRestrict(p+'R', maze, r, c+1);
		}
	}
	
	static void allPaths(String p, boolean[][] maze, int r, int c) {
		if(r==maze.length-1&&maze[0].length-1==c) {
		    System.out.println(p);
		    return;
		} 
		if(!maze[r][c]) {
			 return;
		}
		maze[r][c]=false;
		if(r<maze.length-1) {
			 allPaths(p+'D', maze, r+1, c);
		}
		if(c<maze[0].length-1) {
			allPaths(p+'R', maze, r, c+1);
		}
		if(r>0) {
			allPaths(p+'U', maze, r-1, c);
		}
		if(c>0) {
			allPaths(p+'L', maze, r, c-1);
		}
		maze[r][c]=true;
	}
}
