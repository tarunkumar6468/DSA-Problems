package puzz;

import java.util.Scanner;

public class tableDiff {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int table1 = sc.nextInt();
        int table2 = sc.nextInt();
        tableDifferance(table1,table2);

    }
    public static void tableDifferance(int n1, int n2){
        int a = n1;
        int b = n2;
        int arr[] = new int[10];
        for(int i = 0; i<10; i++){
            int d = n1-n2;
            arr[i] = d;
            n1 +=a;
            n2 +=b;
        }
        for(int i= 0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
