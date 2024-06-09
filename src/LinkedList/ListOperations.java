package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args){
    LL list  = new LL();
    list.insertFirst(8);
    list.insertFirst(2);
    list.insertFirst(9);

    list.display();
    List<Integer> li = new ArrayList<>();
    li.add(9);
    li.toArray();
    li.add(1,2);
    li.remove(1);
    li.stream();
    System.out.println(li);;
    }
}
