package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result_of_Binary {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // Example input
        int result = findMaxBinaryConcatenation(nums);
        System.out.println("Maximum Possible Number: " + result);  // Output: 30
    }

    public static int findMaxBinaryConcatenation(int[] nums) {
        List<String> binaries = new ArrayList<>();

        // Convert each number to binary string
        for (int num : nums) {
            binaries.add(Integer.toBinaryString(num));
        }

        // Get all permutations of binary strings and calculate the maximum possible value
        List<List<String>> permutations = getPermutations(binaries);
        int maxValue = 0;

        // Check each permutation by concatenating binary strings
        for (List<String> permutation : permutations) {
            StringBuilder concatenated = new StringBuilder();
            for (String binary : permutation) {
                concatenated.append(binary);
            }
            // Convert concatenated binary string to decimal
            int value = Integer.parseInt(concatenated.toString(), 2);
            maxValue = Math.max(maxValue, value);
        }

        return maxValue;
    }

    // Helper function to generate all permutations of the binary strings
    public static List<List<String>> getPermutations(List<String> binaries) {
        List<List<String>> result = new ArrayList<>();
        permute(binaries, 0, result);
        return result;
    }

    // Recursive function to generate permutations
    public static void permute(List<String> binaries, int index, List<List<String>> result) {
        if (index == binaries.size()) {
            result.add(new ArrayList<>(binaries));
            return;
        }

        for (int i = index; i < binaries.size(); i++) {
            Collections.swap(binaries, i, index);
            permute(binaries, index + 1, result);
            Collections.swap(binaries, i, index);  // Backtrack
        }
    }
}