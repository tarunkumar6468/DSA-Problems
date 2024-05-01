package contest;

import java.util.HashMap;
import java.util.Scanner;

public class frenquency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int dummy[] = checkFreq(n,arr);
for(int i : dummy) {
    System.out.print(i+" ");
}
    }
    public static int[] checkFreq (int n, int[] arr){
        int dumy[] = new int[n];
        int count = 1;
        for(int i = 0; i<n; i++){
            for(int j =  i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            dumy[i] = count;
            count  = 1;
        }
        return dumy;
    }
}
