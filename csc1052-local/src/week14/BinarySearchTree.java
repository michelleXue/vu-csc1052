package week14;

public class BinarySearchTree <T extends Comparable<T> > {

	// A private inner class that represents a binary tree node.
    private class BTNode {
        private T elem;        // the element stored in the node
        private BTNode left;   // the reference to the left child of this node
        private BTNode right;  // the reference to the right child of this node

        // Stores the element and sets the child references to null.
        public BTNode(T element) {
            this.elem = element;
            this.left = null;
            this.right = null;
        }

        // Stores the element and sets the child references to the nodes specified.
        public BTNode(T element, BTNode left, BTNode right) {
            this.elem = element;
            this.left = left;
            this.right = right;
        }
    }
    
    // attribute
    private BTNode root;  // a reference to the root node in the tree

    // Sets up an initially empty tree.
    public BinarySearchTree() {
        root = null;
    }
    
    // using overloading to define the recursive version of add method
    public void add(T elementToAdd) {
        root = add(elementToAdd, root);
    }

	private BTNode add(T elementToAdd, BTNode node) {
		
		// base case: when reach to leaf, add the node
		if (node == null) {
			node = new BTNode(elementToAdd); // create a new node object, and store it to the leaf.
		}
			
		// general case: compare the element with current root data.
		// option 1: go left
		// option 2: go right
		
		// cannot write: node.elem >= elementToAdd
		else if (elementToAdd.compareTo(node.elem) <= 0) {
			node.left = add(elementToAdd, node.left);
		}
		else {
			node.right = add(elementToAdd, node.right);
		}
		
		return node;
	}
	
    // Makes the initial call to the recursive method that determines how many elements
    // are stored in the BST.
    public int size() {
        return size(root);
    }

    // Recursively determines how many elements are in the tree with the specified
    // root node.
    private int size(BTNode node) {
        if (node == null)
            return 0;
        else
            return size(node.left) + size(node.right) + 1;
    }
	
    // Makes the initial call to the recursive method that gets the specified element.
    public T get(T elementToGet) {
        return get(elementToGet, root);
    }

    // Recursively searches the tree for the specified element and returns it if found.
    private T get(T elementToGet, BTNode node) {
        if (node == null)  // element is not in tree
            return null;
        else if (elementToGet.compareTo(node.elem) == 0)  // element found
            return node.elem;
        else if (elementToGet.compareTo(node.elem) < 0)
            return get(elementToGet, node.left);
        else
            return get(elementToGet, node.right);
    }
    
    
    // ****************** Please implement the printInOrder method below ************
    
    public void printInOrder() {
    	
    	printInOrder(root);
        
    }
    
    private void printInOrder(BTNode node) {
    	
    	// base case : reach to null leaf
    	if (node == null) {
    		return; // do nothing
    	}
    	
    	// print left subtree
    	printInOrder(node.left);
    	
    	// print root
    	System.out.print(node.elem + " ");
    	
    	// print right subtree
    	printInOrder(node.right);
    }
    
    
    
    // ****************** Please implement the printInOrder method above ************
    
    
    
    
    
    // Makes the initial call to the recursive method that removes the specified element
    // from the tree.
    public void remove(T elementToRemove) {
        root = remove(elementToRemove, root);
    }

    // Recursively searches for the element to remove. When found, the private removeNode
    // method is called. If not found, the tree is unchanged.
    private BTNode remove(T elementToRemove, BTNode node) {
        // element is not in tree
        if (node != null) {
            if (elementToRemove.compareTo(node.elem) == 0)  // element found
                node = removeNode(node);
            else if (elementToRemove.compareTo(node.elem) < 0)
                node.left = remove(elementToRemove, node.left);
            else
                node.right = remove(elementToRemove, node.right);
        }
        return node;
    }

    // Removes the specified node, considering three possibilities: the node to be removed
    // (1) is a leaf, (2) has one child, or (3) has two children. If either child is null,
    // it replaces the node with the other child -- this takes care of situations (1) and (2).
    // Otherwise, the element in this node is replaced with its inorder predecessor (the
    // largest element in the left subtree), then the predecessor node is removed.
    private BTNode removeNode(BTNode node) {
        if (node.left == null)
            return node.right;
        else if (node.right == null)
            return node.left;
        else {
            T predecessor = getLargestElement(node.left);
            node.elem = predecessor;
            node.left = remove(predecessor, node.left);
            return node;
        }
    }
    
    
    // ****************** Please implement the getLargestElement method below ************

    // Gets the largest element in the subtree with the specified root node. Used by the
    // removeNode method to get the inorder predecessor of an element.
    private T getLargestElement(BTNode node) {
        // keep going right until null leaf.
    	while(node.right != null) {
    		node = node.right;
    	}
    	return node.elem;
    }
    
    // ****************** Please implement the getLargestElement method above ************
    
}
