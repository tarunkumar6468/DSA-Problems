package QueueMaterial;

public class Queue_Implementations {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(){};
         Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public static  boolean isEmpty(){
             return rear==-1 && front==-1;    // if rear is -1 than queue is empty

        }
        public static boolean isFull(){
             return (rear+1)%size == front;
        }

        //Enqueue
        public static void add(int element){
             if(isFull()){
                 System.out.println("Queue is full");
                 return;
             }
             if(front == -1){ // add first element
                 front = 0;
             }
             rear = (rear+1)%size;
             arr[rear] = element;
        }

        // dequeue
        public static int remove(){
             if(isEmpty()){
                 System.out.println("queue is empty!");
                 return -1;
             }
             int res = arr[0];

             // single element condition
             if(rear == front){
                 rear = front = -1;
             }
             else{
                 front = (front+1)%size;
             }
             return res;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty!");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
