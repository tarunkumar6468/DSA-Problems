package puzz;

import java.util.Scanner;

public class checkOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n =sc.nextInt();
        checkHowManyOnes(n);


    }
    public static void checkHowManyOnes(int n){
        int count = 0;
        while(n!=0){
            count +=(n&1);
            n=n>>1;
        }
        System.out.println(count);

    }
}
