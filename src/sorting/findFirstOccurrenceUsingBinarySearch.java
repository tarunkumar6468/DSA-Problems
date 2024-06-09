package sorting;

public class findFirstOccurrenceUsingBinarySearch {
    public static int firstOccurrence(int [] arr, int target){
        int left  = 0;
        int right = arr.length-1;
        int res = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                res = mid;
                right = mid-1;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int []arr = {1,2,2,2,3,4,5};
        int target  = 5;
        int firstIndex = firstOccurrence(arr, target);
        if(firstIndex != -1) {
            System.out.println("The first occurrence of (" + target + ") is at index (" +
                    firstIndex +
                    ").");
        }
            else{
                System.out.println("Target is not found in the array");
            }

    }
}
