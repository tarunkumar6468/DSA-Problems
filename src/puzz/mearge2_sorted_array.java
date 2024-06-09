package puzz;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class mearge2_sorted_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int arr1[]=  new int[m];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        } for(int i = 0; i<m; i++){
            arr1[i] = sc.nextInt();
        }
        int []ans = merge(arr,arr1);
        for(int i = 0; i<n+m; i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] merge(int [] arr, int arr1[]){
        int n = arr.length;
        int m = arr1.length;

        int store [] = new int[n+m];
        for(int i = 0; i<n; i++){
            store[i]  = arr[i];
        }
        for(int i = (n+m)-n; i<n+m; i++){
            store[i]  = arr1[i];
        }
        return store;
    }
}
