package puzz;

import java.util.Scanner;

public class withOutPercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isOdd(n));
        System.out.println(isEven(n));

//        if((n&1)==1){
//            System.out.println("number is odd");
//        }
//        else{
//            System.out.println("number is even ");
//        }
    }
    public static boolean isOdd(int n){
        return (n&1)==1;  // 10100101+00000001 = last bit is 1 than true otherwise false
    }
    public static boolean isEven(int n){
        return (n&1)!=1;
    }
}
