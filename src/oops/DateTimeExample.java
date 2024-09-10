package oops;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {
    public static void main(String [] args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("current date:"+date);
        System.out.println("current time:"+time);
        System.out.println("current DateTime:"+dateTime);
    }
}
