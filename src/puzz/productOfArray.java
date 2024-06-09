package puzz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class productOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = product(arr,n);
        System.out.println(ans);
    }
    public static  int product(int [] arr, int n){
        int i = 0;
        int j = 1;
        int dumy[] = new int[n];
        int max = 0;
        while (n>j){
            arr[i] *= arr[j];
            dumy[i] = arr[i];
            max = Math.max(max,dumy[i]);
            i++;
            j++;
        }
        return max;
    }
}
