package puzz;

import java.math.BigInteger;

public class binaryToDecimal {
    public static void main(String[] args) {
        String s = "11110";
        int res = 0, carry = 0;

        for(int i = s.length() - 1; i> 0; i--){
            res++;
            if(s.charAt(i) - '0' + carry == 1){
                carry = 1;
                res ++;
            }

        }

        System.out.println( res + carry);
    }
}
