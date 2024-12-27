package InterviewAsked;

public class fibonacci {
    public static void main(String[] args){
        int n = 10, num1 = 0,num2 =1;
        System.out.print(num1+" "+num2);
        for(int i = 2; i<=10;i++){
            int num3 = num1+num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }

        System.out.println();
        int ans = by_recursion(n);
        System.out.println(ans+ " ");


    }
    public static int by_recursion(int n){  // nth fib number
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else {
            return by_recursion(n-1)+by_recursion(n-2);
        }
    }

}
