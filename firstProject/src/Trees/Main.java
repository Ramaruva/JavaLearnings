package Trees;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       BinaryTreeImplement bt = new BinaryTreeImplement();
       bt.populate(scan);
       bt.display();
	}

}
