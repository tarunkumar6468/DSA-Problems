package puzz;

import java.util.Scanner;

public class findUniWithXor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,3,4,4,6,2};
        System.out.println(ans(arr));
    }

    private static int ans(int arr[]) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
