package puzz;

import java.util.Scanner;

public class checkSqrt {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = funForSqrt(n);
        System.out.println(ans);

        int WithBinarySearchTech = UsingBinary(n);
        System.out.println(WithBinarySearchTech);
    }
    public static int funForSqrt(int x){
        if(x==0) return 0;
        long ans = 1;
        for(long i=1;i<x;i++){
            if(i*i==x){
                ans=i;
                break;
            }
            else if((i*i)<x)ans = i;
            else break;
        }
        return (int)ans;
    }
    public static  int UsingBinary(int x){
        if(x==0)return x;

        int left = 1;
        int right = x;
        int ans  = 0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid<=x/mid){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}
