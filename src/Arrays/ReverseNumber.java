package Arrays;

public class ReverseNumber {
    public static void main(String[] args){
        int n = 328928;

       int rem = numberReverse(n);
        System.out.println(rem);

        int secondAnswer = secondFun(n);
        System.out.println(secondAnswer);

    }
    public static int numberReverse(int num){

        int rem = 0;
        while(num!=0){
            int digit = num%10;
            rem = rem*10+digit;
            num/=10;
        }
        return rem;
    }
    public static int secondFun(int num){
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb.toString();
        int n = Integer.parseInt(str);
        return n;
    }
}
