package puzz.course;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamCheck {
    public static void main(String[] args) {
        Stream.iterate(1,x->x+1)
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::print);

    }
}
