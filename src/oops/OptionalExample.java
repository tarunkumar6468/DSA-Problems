package oops;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(System.out::println);
    }
}
