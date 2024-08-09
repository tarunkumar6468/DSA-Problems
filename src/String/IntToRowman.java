package String;

import java.util.Scanner;

public class IntToRowman {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = intToRoman(n);
        System.out.println(ans);

    }
    public static String intToRoman(int num) {
        String leser10[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String leser100[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String leser1000[] = {"", "C", "CC", "CCC", "XD", "D", "DC", "DCC", "DCCC", "CM"};
        String leser10000[] = {"","M","MM","MMM"};
        if (num < 10) return leser10[num];

        if (num < 100) {
            return leser100[num / 10] + leser10[num % 10];
        }
        if (num <1000){
            return leser1000[num / 100] + intToRoman(num% 100);

    }
        return leser10000[num / 1000] + intToRoman(num % 1000);
    }
}
