package puzz.patterns;

import java.util.Scanner;

public class digitsCount {
    public static void main(String[] args){
        digitCount(439);

        withoutUsingLog(0);
    }
    public static void digitCount(int num){
        if (num==0){
            System.out.println("number is 1:");
            return ;
        }
        int count = (int)((int)Math.log(num)/Math.log(10))+1;
        System.out.println("number is "+count+":");
    }

    public static void withoutUsingLog(int num){
        if (num==0){
        System.out.println("number is 1:");
        return ;
    }
        int res = 0;
        while(num>0){
            num /=10;
            res++;
        }
        System.out.println(res);
    }
}
