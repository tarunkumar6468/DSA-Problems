package stack.questions;

import java.util.Stack;

public class validPer {
    public static void main(String[] args){
        String s = "))))))))))))";
        System.out.println(checkString(s));
    }
    public static boolean checkString(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch == '['){
                st.push(ch);
            }
            else {
                if(st.isEmpty())
                    return false;
                else
                    if((st.peek()=='(' && ch ==')') ||
                            (st.peek()=='{' && ch =='}')||
                            (st.peek()=='[' && ch ==']')){
                        st.pop();
                    }
            }
            if(st.isEmpty()){
                return true;
            }
        }
        return false;
    }
}
