package LinkedList;

class Node{
    int data;
    Node next;
    Node (){

    }
   public Node(int data ){
        this.data = data;
        this.next = null;
    }
}

public class RetriveData {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};

        Node list = new Node(arr[3]);
        System.out.println(list.data); // pic a random number pic

        Node ans = FindHead(arr);
        System.out.println(ans.data); // head of the list
    }
    public static Node FindHead(int arr[]){
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i = 0; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = null;
            mover = temp;
        }
        return head;
    }
}
