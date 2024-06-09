package LinkedList;

public class LL {
    public class Node{
       private int value;
       private Node next;
       public Node (int value){
           this.value = value;
       }
       public Node (int value, Node Next){
           this.value = value;
           this.next = Next.next;
       }
    }
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head  = newNode;
        if(tail==null){
            tail = head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
