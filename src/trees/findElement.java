package trees;

import java.util.Stack;

public class findElement {
public static void main(String[] args){
    BST tree = new BST();
    tree.insert(10);
    tree.insert(134);
    tree.insert(12);
    tree.insert(123);
    tree.insert(11);
    tree.insert(103);
    tree.insert(14);
    tree.insert(132);
    tree.insert(103);
    tree.insert(122);

    tree.inorder();
    int find = 122;
    if(tree.search(find)){
        System.out.println("Node with value "+ find + " is Present in the BST");
    }else{
        System.out.println("Node with value "+ find+ " is not present in the BST");
    }
}
}

class Node{
    Node left;
    int val;
    Node right;
    Node(int val){
        this.val = val;
    }
}

class BST {
    Node root;

    public void insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            if (temp.val > key) {
                prev = temp;
                temp = temp.left;
            } else if (temp.val < key) {
                prev = temp;
                temp = temp.right;
            } else return;
        }
        if (prev.val > key) {
            prev.left = node;
        } else {
            prev.right = node;
        }
    }

    public void inorder() {
        Node temp = root;
        Stack<Node> st = new Stack<>();
        while (temp != null || !st.isEmpty()) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;

            } else {
                temp = st.pop();
                System.out.println(temp.val + " ");
                temp = temp.right;
            }
        }
        System.out.println();
    }

    public boolean search(int key) {
        Node temp = root;
        while (temp != null) {
            if (temp.val == key) {
                return true;
            } else if (temp.val > key) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;

    }

}
