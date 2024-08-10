package Arrays;

public class ResverseArray {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        reverse(arr);

    }
    public static void reverse(int arr[]){
        int arr1[] = new int[arr.length+1];
        int index = 0;
        for(int i = arr.length-1; i>=0; i--){
            arr1[index++] = arr[i];
        }
        for (int i =0 ;i<arr1.length-1; i++){
            System.out.print(" "+arr1[i]);
        }
    }
}
