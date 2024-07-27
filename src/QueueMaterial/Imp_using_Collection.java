package QueueMaterial;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Imp_using_Collection {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
