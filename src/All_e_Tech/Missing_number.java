package All_e_Tech;

public class Missing_number {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Total numbers in the range (1 to n+1)
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}
