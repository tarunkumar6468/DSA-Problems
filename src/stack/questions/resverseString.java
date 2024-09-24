package stack.questions;

import java.util.Scanner;
import java.util.Stack;

public class resverseString {
    public static void main(String[]args){
        String s  = "Tarun";
        reverseStringFun(s);

    }
    public static void reverseStringFun(String s){
        Stack<Character> st = new Stack<>();

        int l = s.length()-1;

        int i = 0;
        while (l>=i){
            st.push(s.charAt(i));
            i++;
        }
        while(!st.isEmpty()){
            if(st.size()==1){
                System.out.print(st.pop());
            }
            else
                System.out.print(st.pop()+"->");

        }
    }
}
