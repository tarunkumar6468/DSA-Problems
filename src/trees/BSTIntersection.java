package trees;

import java.util.ArrayList;
import java.util.List;

public class BSTIntersection {
    public static void main(String[] args) {
        // Creating first BST
        BSTT tree1 = new BSTT();
        tree1.insert(10);
        tree1.insert(20);
        tree1.insert(5);
        tree1.insert(15);
        tree1.insert(30);

        // Creating second BST
        BSTT tree2 = new BSTT();
        tree2.insert(15);
        tree2.insert(25);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(35);

        // Finding the intersection of two BSTs
        List<Integer> intersection = findIntersection(tree1.root, tree2.root);

        // Printing the intersection
        System.out.println("Intersection of the two BSTs: " + intersection);
    }

    // Function to find the intersection of two BSTs
    public static List<Integer> findIntersection(Node1 root1, Node1 root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Perform in-order traversal to get the sorted lists
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);

        // Find the intersection of the two sorted lists
        return findCommonElements(list1, list2);
    }

    // In-order traversal to get the sorted list of node values
    public static void inOrderTraversal(Node1 root, List<Integer> list) {
        if (root != null) {
            inOrderTraversal(root.left, list);
            list.add(root.val);
            inOrderTraversal(root.right, list);
        }
    }

    // Function to find common elements in two sorted lists
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).equals(list2.get(j))) {
                intersection.add(list1.get(i));
                i++;
                j++;
            } else if (list1.get(i) < list2.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return intersection;
    }
}

class Node1 {
    Node1 left;
    int val;
    Node1 right;

    Node1(int val) {
        this.val = val;
    }
}
class BSTT {
    Node1 root;

    public void insert(int key) {
        Node1 node = new Node1(key);
        if (root == null) {
            root = node;
            return;
        }
        Node1 prev = null;
        Node1 temp = root;
        while (temp != null) {
            prev = temp;
            if (temp.val > key) {
                temp = temp.left;
            } else if (temp.val < key) {
                temp = temp.right;
            } else {
                return; // Duplicate keys are not allowed in BST
            }
        }
        if (prev.val > key) {
            prev.left = node;
        } else {
            prev.right = node;
        }
    }
}
