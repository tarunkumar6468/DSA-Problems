package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class checkEvenOdd {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(10,20,4,55,21);
        list.stream().filter(i -> i%2==0 ).collect(Collectors.toList())
                .forEach(str-> System.out.print(str+"-> "));
    }
}
