package sorting;

import java.util.Arrays;

public class sortingInOneLine {
    public static void main(String[] args){
        int arr[] = {1,5,4,3,0,2};
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
