package sorting;

public class insertionSort {
    public static void main(String[] agrs){
        int arr[] = {5, 3, 2, 1, 4};
        insertionSortTech(arr);
        printArray(arr);
    }
    public static void  insertionSortTech(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
