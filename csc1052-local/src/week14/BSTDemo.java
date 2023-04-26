package week14;

public class BSTDemo {

	public static void main(String[] args) {
		// create a tree by adding 43, 67, 25, 30, 89
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		bst.add(43);
		bst.add(67);
		bst.add(25);
		bst.add(30);
		bst.add(89);
		
		bst.printInOrder(); // print elements increasingly
		System.out.println();
		
		bst.remove(43);
		bst.printInOrder(); // print elements increasingly

	}

}
