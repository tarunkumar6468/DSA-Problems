package puzz.patterns;

import java.util.Scanner;

  import java.util.Arrays;

    public class ArrayElementPattern {
        public static void main(String[] args) {
            int[] arr = {-3, 2, 4, -2, 3};
            printAsteriskPattern(arr);
        }

        public static void printAsteriskPattern(int[] arr) {
            int maxHeight = Arrays.stream(arr).map(Math::abs).max().orElse(0);
            char[][] pattern = new char[2 * maxHeight + 1][arr.length];

            // Initialize the pattern with spaces
            for (char[] row : pattern) {
                Arrays.fill(row, ' ');
            }

            // Fill in the asterisks
            for (int i = 0; i < arr.length; i++) {
                int value = arr[i];
                int absValue = Math.abs(value);

                for (int j = 0; j < absValue; j++) {
                    if (value > 0) {
                        pattern[maxHeight - 1 - j][i] = '*';
                    } else {
                        pattern[maxHeight + 1 + j][i] = '*';
                    }
                }
            }

            // Print the pattern
            for (char[] row : pattern) {
                if (Arrays.equals(row, pattern[maxHeight])) {
                    System.out.println(new String(new char[arr.length]).replace('\0', '~'));
                } else {
                    System.out.println(row);
                }
            }
        }
    }

