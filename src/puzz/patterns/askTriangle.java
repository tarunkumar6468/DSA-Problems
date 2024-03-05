package puzz.patterns;

import java.util.Scanner;

public class askTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num++ + " ");
                }
                num = num - i + 1; // Reset num for the next row
                System.out.println();
        }
    }
}
