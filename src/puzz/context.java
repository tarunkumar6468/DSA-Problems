package puzz;

public class context {
    public static void main(String[] args){
        get(6);
    }
    static void get (int n){
        if(n<1){
            return;
        }
        get(n-1);
        get(n-3);
        System.out.print(" "+n);
    }
}
