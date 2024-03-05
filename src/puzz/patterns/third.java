package puzz.patterns;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FThird(n);

        System.out.println();

        reverseThird(n);

        System.out.println();

        numberInMatrixForm(n);

        System.out.println();

        StarOfTriangle(n);


    }

    public static void FThird(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n - j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void reverseThird(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n - j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void numberInMatrixForm(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=n; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void StarOfTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

