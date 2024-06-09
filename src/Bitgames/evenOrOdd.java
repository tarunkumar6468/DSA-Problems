package Bitgames;

public class evenOrOdd {
    public static  void main(String[] args){

        checkOddAndEven(10);
        printBits(52);
        System.out.println();
        System.out.print(checkIthBit(32,5));
    }
    public static void checkOddAndEven(int n){
        if((n&1)==1){
            System.out.println("odd");
        }
        else System.out.println("even");
    }
public static boolean checkIthBit(int n, int position){
        int ans = n&(1<<position);
    return (ans==0)?false:true;
}
public static void printBits(int num){
        for(int i = 7;i>=0; i--){
            System.out.print((num>>i)&1);
        }
}
}

