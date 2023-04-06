//Akash Dev
//2141004126
class arraySortBST {
	// declare a class node of the binary tree.
	// It will have a data type and address of it's left and right node respectively
	class Node {
		int data;
		Node left, right;

		// The data in the node will be equal to the value entered by the user.
		public Node(int value) {
			data = value;
			// Initially left and right address of the node wil be null.
			left = right = null;
		}
	}

	Node root;

	arraySortBST() {// Initialize the root of the bst as null.
		root = null;
	}

	// insert data in the tree
	void insert(int data) {
		root = insertNode(root, data);
	}
	// This function will insert a new node to the binary search tree recursively.

	Node insertNode(Node root, int data) {
		// At the starting the value of the node is null since we have declared it.
		// While the value is null we will make a new node and enter the data from the
		// array.
		if (root == null) {
			root = new Node(data);
			return root;
		}
		// if the data is less then the node will be inserted at the left of the node.
		if (data < root.data) {
			root.left = insertNode(root.left, data);
			// if the data is more than the node will be inserted at the right of the node.
		} else if (data > root.data) {
			root.right = insertNode(root.right, data);
		}
		return root;
	}

	// Traverse the array inorder way.
	// First check the left side of the array.
	// Then print the data Then check the right side of the array recursively.
	static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// This is a simple method to fill all the elements of the array in the tree in
	// linear time i.e. O(n)
	void insertTree(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}

	public static void main(String args[]) {
		arraySortBST tree = new arraySortBST();
		int arr[] = { 3, 5, 6, 8, 7, 1, 9 };
		tree.insertTree(arr);
		inorder(tree.root);
	}
}