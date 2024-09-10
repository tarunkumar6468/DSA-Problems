package String;

import java.util.Scanner;

public class reverseStringUsingCharArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = reverseString(s);
        System.out.println(m);
    }
    public static String reverseString(String str){
        char []ch = str.toCharArray();
        String ans = "";
        for(int i = str.length()-1;  i>=0; i--){
            ans+=ch[i];
        }
        return ans;
    }
}
