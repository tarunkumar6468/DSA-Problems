package josh_tech;

import java.util.Arrays;

public class square_element {
    public static void main(String[] args){
        int [] arr = {-7,-4,1,2,3,4};
        int [] dummy = new int [arr.length];
        for(int i =0; i<arr.length; i++){
            int sq = arr[i]*arr[i];
            dummy[i] = sq;
        }
        Arrays.sort(dummy);
        for(int  i = 0; i<dummy.length; i++){
            System.out.print(dummy[i] +" ");
        }
        // time complexity of this code (n+n log n)
        System.out.println();
        reduceTimeComplexity(arr);
    }

    public static void reduceTimeComplexity(int [] arr){
        int n=arr.length;
        int dummy[]= new int[n];
        int left = 0;
        int right = n-1;
        int index = n-1;
        while(left<=right){
            int leftSq = arr[left]*arr[left];
            int rightSq = arr[right]*arr[right];
            if(leftSq > rightSq){
                dummy[index] = leftSq;
                left++;
            }
            else {
                dummy[index] = rightSq;
                right--;
            }
            index--;
        }
        for(int i =0 ; i<n; i++){
            System.out.print(dummy[i]+ " ");
        }
    }



}
