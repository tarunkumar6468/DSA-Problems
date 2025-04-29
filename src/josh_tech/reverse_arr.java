package josh_tech;

import java.util.Arrays;

public class reverse_arr {
    public static void main(String[] args){
        int arr[] = {12,3,4,9,5,4,6,45};
     
       recCall(arr);

    }
    public static void reverse_Array(int []arr){
        int n = arr.length;
        int []temp = new int[n];
        for(int i =0; i<n;i++){
            temp[i] = arr[n-i-1];
        }
        for (int i = 0; i<n; i++){
            arr[i] = temp[i];
        }
        for(int i =0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void using_recursion(int[]arr, int l, int r) {
        if (l >= r) {
            return;
        }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            using_recursion(arr, l + 1, r - 1);
        }
        public static void recCall(int arr[]){
        using_recursion(arr,0,arr.length-1);
          for(int i =- 0; i<arr.length; i++){
              System.out.print(arr[i]+" ");
          }

        }


}
