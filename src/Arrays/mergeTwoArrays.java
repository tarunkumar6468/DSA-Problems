package Arrays;

import java.util.Scanner;

public class mergeTwoArrays {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in nums1 (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the elements of nums1: ");
        int[] nums1 = new int[m + 100]; // Extra space for merging; assume enough space
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        // Fill the rest of nums1 with zeros (assumed to be the placeholder)
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = 0;
        }

        // Input for nums2
        System.out.print("Enter the number of elements in nums2 (n): ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.print("Enter the elements of nums2: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call the merge method
        AfterMerging(nums1, m, nums2, n);

        // Output the merged array
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
    public static void AfterMerging(int nums1[], int m, int nums2[], int n){
        int i = m - 1; // Pointer for the end of the initial elements in nums1
        int j = n - 1; // Pointer for the end of nums2
        int k = m + n - 1; // Pointer for the end of the merged array

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy any remaining elements from nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

}
