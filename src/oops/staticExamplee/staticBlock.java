package oops.staticExamplee;

public class staticBlock {
    static  int a = 4;
    static int b;
    static {
        System.out.println("I am in static block");
        b = a*5;
    }
    public static void main(String[] args){
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a +" "+staticBlock.b);
        staticBlock.b +=3;
        staticBlock onj2 = new staticBlock();
        System.out.println(staticBlock.b);
        System.out.println(staticBlock.a +" "+staticBlock.b);
    }
}
