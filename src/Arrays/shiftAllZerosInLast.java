package Arrays;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class shiftAllZerosInLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =  new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] ans = shiftAllZero(arr);
        for(int i = 0; i<n; i++){
            if(i==n-1)
                System.out.println(arr[i]);
            else
                System.out.print(ans[i]+"->");
        }

    }
    private static  int []shiftAllZero(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int  i= 0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
        return arr;
    }
}
