package puzz.patterns;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        binaryFind(n);
    }
    public static void  binaryFind(int decimal){
        int result = 0;
        int power = 0;
        while(decimal>0){
            int rem = decimal%2;
            decimal /=2;
            result += rem*Math.pow(10,power);
            power++;
        }
        System.out.println("number binary is "+ result);
    }
}
