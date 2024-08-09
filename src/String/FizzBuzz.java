package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        List<String>ans = finalAns(n);
        for(String as : ans){
            System.out.print(as+" ");
        }

    }
    public static List<String>finalAns(int n){
        List<String> list = new ArrayList<>();
        for (char i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i > 2) {

                list.add("FizzBuzz");
            } else if (i % 3 == 0 && i > 2) {
                list.add("Fizz");
            } else if (i % 5 == 0 && i > 2) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

}
