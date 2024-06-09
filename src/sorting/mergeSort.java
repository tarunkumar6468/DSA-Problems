package sorting;

import java.util.Scanner;

public class mergeSort {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        printArray(arr);
    }
    public static  void printArray(int []arr){ // this function used to print the array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static  void mergeSort(int[] arr,int s, int e){
        if(s>=e)return; // base case
        int mid = s+(e-s)/2; // find the mid
        mergeSort(arr,s,mid); // here first use arr ans change the end replace the mid because here mid is the next end of the
        // next divided array
        mergeSort(arr,mid+1,e); // now we change the starting point because right side array mid+1 = start so we change that
        //  end is the same as the original array
        merge(arr,s,mid,e); // here we create the new function for merge according to sorting  we have four variable array ,, staring point
        // and mid and last is end point  goto the function inner part
    }
    public static void merge(int arr[],int s, int mid,int e){
        int temp[] = new int  [e-s+1]; // here we create the temp array  it's length is (end-start+1)
        int i  = s; // point the array start =  i
        int j = mid+1; // point the  mid+1 = j
        int k = 0;
        // int point k   = 0 initialization
        while (i<=mid && j<=e){ // condition  is agar i is equal  or less than to mid  && j  less than and equal to end then TRUE otherWise false
            if(arr[i]<arr[j]){ // now comparing the array
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){ // if any element is left then we add it
            temp[k++] = arr[i++];
        }
        while (j<=e){
            temp[k++] = arr[j++];
        }
        // copy of the original array
        for (k = 0, i = s; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
}
