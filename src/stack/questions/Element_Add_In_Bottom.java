package stack.questions;

import java.util.Stack;

public class Element_Add_In_Bottom {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        addElementBottom(st,4);
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void addElementBottom(Stack<Integer> st , int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        addElementBottom(st,data);
        st.push(top);
    }
}
