package puzz.course;

import java.net.Inet4Address;
import java.util.ArrayList;

public class checkList {
    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(10);
        al.add(20);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}
