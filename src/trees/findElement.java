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

class BST{
    Node root;
    public void insert(int key){
        Node node = new Node(key);
        if(root == null){
            root = node;
            return;
        }
        Node prev = null;
        Node temp = root;
        while(temp!=null){
            if(temp.val>key){
                prev  = temp;
                temp = temp.left;
            }
            else if(temp.val<key){
                prev = temp;
                temp = temp.right;
            }
        }
        if(prev.val > key){
            prev.left = node;
        }
        else {
            prev.right = node;
        }
    }
    public void inorder(){
        Node temp = root;
        Stack<Node>st = new Stack<>();
    while(temp!=null || !st.isEmpty()){
        if(temp!=null){
            st.push(temp);
            temp = temp.left;

        }
        else{
            temp = st.pop();
            System.out.println(temp.val+" ");
            temp = temp.right;
        }
    }

    }

}
