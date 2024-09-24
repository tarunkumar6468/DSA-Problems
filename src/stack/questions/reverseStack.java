package stack.questions;

import java.util.Stack;

import static stack.questions.Element_Add_In_Bottom.addElementBottom;

public class reverseStack {
    public static void main(String[]args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        // 3 2 1

        reverse(st);
        printStack(st); // 1 2 3


    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        addElementBottom(s,top);

    }
    public static void printStack(Stack<Integer>st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

}
