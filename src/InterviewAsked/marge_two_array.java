package InterviewAsked;

public class marge_two_array {
    public static void main(String[] agrs){
        int arr1[] = {1,2,3,4};
        int arr2[] = {2,3,4,5};

        int merge[] = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,merge,0,arr1.length);
        System.arraycopy(arr2,0,merge,arr1.length,arr2.length);
        for (int i = 0; i<merge.length; i++){
            System.out.print(merge[i]+" ");
        }
     }
}
