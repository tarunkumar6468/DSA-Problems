package sorting;

import java.util.Arrays;
import java.util.Collections;

public class usingCollectionSorting {
    public static void main(String[] args){
        Integer arr[] = {5,3,2,1,0};
        Arrays.sort(arr,0,3);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder() );
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
