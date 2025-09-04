package java8;

import java.util.Arrays;
import java.util.List;

public class Convert_upperCase_String {
    public static void main(String[] args){
        List<String>list =
                Arrays.asList("apple","banana","coconut","banana","papaya","grapes","pomegranate");

        list.stream()
               // .map(str->str.toUpperCase())
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
                //.forEach(str-> System.out.print(str + ": " ));
    }
}
