package puzz;

public class snippet {
    static  int s;
    public static void main(String[] args){
        snippet p = new snippet();
        p.start();
        System.out.println(s);
    }
    void start(){

        int x = 7;
        twice(x);

        System.out.print(x+" ");

    }
    void twice(int x){
        x = x*2;
        s = x;
    }


}
