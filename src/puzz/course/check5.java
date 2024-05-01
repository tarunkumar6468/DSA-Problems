package puzz.course;

import java.util.TreeSet;

public class check5 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(5);
        s.add(2);
        s.add(15);
        s.add(1);

        System.out.print(s.floor(5)+ " ");
        System.out.print(s.ceiling(5));

    }
}
