package Arrays;

public class findUnique {
    public static void main(String[] args){
        int arr[] = {1,2,3,1,2,3,6};
        int ans = findUniqueFun(arr);
        System.out.println(ans);
    }
    public static int findUniqueFun(int arr[]){
        int unique = 0;
        for(int i = 0; i<arr.length; i++){
            unique^=arr[i];
        }
        return unique;

    }
}
