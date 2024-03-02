package puzz;
import java.util.*;
public class nNumberOfXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            TC_is_On(n);  // here time complexity is o(N)
            TC_is_oOf_one(+n); // here time complexity is 0(1)
        }
    }
        public static void TC_is_On ( int n){
        int ans=0;
            for (int i = 1; i <=n; i++) {
                ans = ans ^ i;
                //System.out.println(n);
            }
            System.out.print("answer = " + ans);
        }
        public static void TC_is_oOf_one ( int n){
            if (n % 4 == 0) System.out.println(n);
            if (n % 4 == 1) System.out.println(1);
            if (n % 4 == 2) System.out.println(n + 1);
            if (n % 4 == 3) System.out.println(0);
        }
    }


