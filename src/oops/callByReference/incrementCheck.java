package oops.callByReference;

public class incrementCheck {
    int value = 10;
    public static void incrementFun(incrementCheck pb){
        pb.value = pb.value+1;
        System.out.println("value in method: "+pb.value);
    }
    public static void main(String[] args){
        incrementCheck ic = new incrementCheck();
        System.out.println("value before call function: "+ic.value);
        incrementFun(ic);
        System.out.println("value after call function: "+ic.value);
    }
}
