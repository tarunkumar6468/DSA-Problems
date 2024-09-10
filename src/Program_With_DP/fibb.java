package Program_With_DP;

import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = fibFun(n);
        System.out.println(ans);
        System.out.print("DP ans: ");
        int f[]= new int[n+1];

        int ansDP = fibDPFun(n,f);
        System.out.println(ansDP);

        int dpans = tebFun(n);
        System.out.println("tebulations means top to down : "+dpans);
    }
    public static int fibFun(int n){
        if(n==0||n==1){
            return n;
        }
        return fibFun(n-1)+fibFun(n-2);
    }
    public static int fibDPFun(int n, int []dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]= fibDPFun(n-1,dp)+fibDPFun(n-2,dp);
        return dp[n];
    }
    public static int tebFun(int n){
        int dp[]=new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
