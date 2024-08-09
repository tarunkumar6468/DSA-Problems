package Bitgames;

import java.util.Scanner;

public class leftMostBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n = 8 = 1000 ans = 4
        int ans = findBit(n);
        System.out.println(ans);
    }
    public static int findBit(int n){
        int count = 0;
        while(n!=0) {
            if ((n & 1) == 0) {
                count++;
                n--;
            } else {
                n >>= 1;
            }

        }
        return count;
    }
}
