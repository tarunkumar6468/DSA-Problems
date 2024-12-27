package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int t = 0; t<n; t++){
            arr[t] = sc.nextInt();
        }
        int target = sc.nextInt();

       int ans =  Target_find(n,arr, target);
        System.out.println("yes find it : "+ ans);
    }
    public static int Target_find(int n, int []arr,int target){
        for(var i: arr){
            if(i==target){
                return i;
            }
        }
        return -1;
    }
}
