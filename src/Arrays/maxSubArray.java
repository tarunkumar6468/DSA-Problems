package Arrays;

import java.util.Scanner;

public class maxSubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int ans  = maxSubArraySum(arr);
        System.out.println(ans);
    }
    public static int maxSubArraySum(int [] arr){
        int n  = arr.length;
        int sum  =0 ;
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i<n; i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum = 0;
            }


        }
        return max;
    }
}
