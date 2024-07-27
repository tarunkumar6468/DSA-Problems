package String;

public class reverseString {
    public static void main(String[] args){
        String s = "Hello";
            String ans = reverseStringFun(s);
        System.out.println(ans);
    }
    public static String reverseStringFun(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
