package sorting;

import java.net.Inet4Address;

public class selectionSort {
    public static void main(String[] args){
        int arr[] = {5,3,2,1,0,4};
        selectionSortTech(arr);
        printArray(arr);
    }
    public static void selectionSortTech(int [] arr){
        int m = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp  = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
