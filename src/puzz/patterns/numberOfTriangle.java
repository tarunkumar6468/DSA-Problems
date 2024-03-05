package puzz.patterns;

import java.util.Scanner;

public class numberOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NumberOfTrianglee(n);

        System.out.println();

        countingTriangle(n);

        System.out.println();

        nextLineStartingWithSameNumber(n);

        System.out.println();

        reverseNumberTriangle(n);


    }
    public static void NumberOfTrianglee(int n){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            while (j<=i){
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
    }

    public static void countingTriangle(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void nextLineStartingWithSameNumber(int n){

        for(int i = 1; i<=n; i++){
                int value = i;
            for(int j = 1; j<=i; j++){

                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
    public static void reverseNumberTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = i; j<=n-(n-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
