package stack.questions;

import java.util.Stack;

public class next_Greater_Element {
    public static void main(String[] args){
        int []arr = {6 ,8,0,1,3};

        findNextGreaterElement(arr);

    }
    public static void findNextGreaterElement(int []arr){
        Stack<Integer> st = new Stack<>();

        int [] nextGreater = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[st.peek()];

            }
            st.push(i);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
