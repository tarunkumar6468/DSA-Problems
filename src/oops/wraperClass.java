package oops;

public class wraperClass {
    public static void main(String[] args){
        int a =10;
        int b = 39;
        Integer num = 45;
        swap(a,b);
        System.out.println(a+" "+b);
    }
   static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
