package Bitgames;

public class ReverseBits {
    public static void main(String[] args){
        int n =10;
        int reverse = reverseBits(n);
        System.out.println(reverse);
    }
    public static int reverseBits(int n){
        int result =  0;
        for(int i = 0; i<32; i++){
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
