import java.util.*;
// To make a binary tree first we will make a root node then ask for user to enter the left node recursevely and if he don't want to enter any data he should enter -1 then the function will ask the user to add the data of the right node. This function will be called recursively. 

//Akash Dev
//2141004126
class Node {
    // we will use a doubly linkedlist in this node class
    // left and right node will point the left and right child and data value will
    // have the current value of that node.
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
    }
}

class binaryTree {
    // In create function we will take data from the user.
    // The data entered by the user will be our root node.
    static Node create() {

        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter value");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left child of " + root.data);
        root.left = create();// We are using recursion to call the create function again and make user to
                             // enter the left node.
        System.out.println("Enter the right child of " + root.data);
        root.right = create();// We are using recursion to call the create function again and make user to
                              // enter the right node.
        return root;
    }

    // In inorder traversel we use left-node-right steps
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);//first it will come to the right most leaf using recursion. 
        System.out.println(root.data);//then it will print the data in that node.
        inorder(root.right);//Then it will check for the right node if present.

    }

    //In preorder traversal we use node-left-right steps
    static void preorder(Node root){
        System.out.println(root.data);//First print the data on the root node.
        preorder(root.left);//then check for all the left nodes recursively.
        preorder(root.right);//Now check for all the right nodes recursively if present.
    }

    //In postorder traversal we use left-right-node steps
    static void postorder(Node root){
        postorder(root.left);//First check for all the left nodes.
        postorder(root.right);//Then search for all the right nodes.
        System.out.println(root.data);//Print the data of the nodes if possible. 

    }

    public static void main(String[] args) {
        Node root = create();
    
    }
}
