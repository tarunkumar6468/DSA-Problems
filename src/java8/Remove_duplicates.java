package java8;

import java.util.Arrays;
import java.util.List;

public class Remove_duplicates {
    public static void main(String[] args){
        List<String>list=
                Arrays.asList("apple","banana","coconut","bana","papaya","grapes","pomegranate","kiwi","kiwi"); // kiwi is 2 times so
        // remove it using stream and distinct function
        
        list.stream()
                .distinct().forEach(System.out::println);
    }
}
