package accen;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findRoots(arr);
        System.out.println(ans);
    }
    public static int findRoots(int [] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 1;j*j<=arr[i]; j++){
                if(j==arr[i]){
                    count++;
                }
            }
        }
       return count;
    }
}
