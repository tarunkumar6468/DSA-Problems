package Arrays;

import java.util.Scanner;

public class Total_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];


        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = countSum(arr,k);
        System.out.println(ans);
    }
    public static int countSum(int arr[], int k) {
        int count = 0;
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                count += 1;
            } else if (arr[i] % k == 0) {
                d = arr[i] / k;
                count += d;
            } else {
                d = arr[i] / k;
                count += d + 1;
            }
        }
        return count;
    }
    }

