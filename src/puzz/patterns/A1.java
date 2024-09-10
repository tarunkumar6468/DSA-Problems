package puzz.patterns;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
