package java8;

import java.util.Arrays;
import java.util.List;

public class Greater_then_5 {
    public static void main(String[] args){
        List<String>list=
                Arrays.asList("apple","banana","coconut","bana","papaya","grapes","pomegranate","kiwi");

        list.stream()
                .filter(str->str.length()>5)
                .forEach(System.out::println);
    }
}
