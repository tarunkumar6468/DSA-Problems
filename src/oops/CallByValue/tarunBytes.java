package oops.CallByValue;

public class tarunBytes {

    public static void increment(int value){
        value+=1;
        System.out.println("value in method = "+value);
    }
    public static void main(String[] args){
        int value = 10;
        System.out.println("before function call value is:  "+ value);
        increment(value);
        System.out.println("after function call value is: "+value);
    }
}

