package Arrays;

import java.util.Scanner;

public class checkGievnRangeNumberCountPrime {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int ans = countPrint(n,m);
        System.out.println(ans);
    }

    public static int countPrint(int input1, int input2) {
        int count = 0;
        int pcount = 0;
        for (int i = input1; i <= input2; i++) {

            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0)
                    count++;
            }
            if (count == 0)
                pcount++;
        }
        return pcount;
    }
}
