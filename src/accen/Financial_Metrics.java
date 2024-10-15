package accen;

import java.util.Scanner;

public class Financial_Metrics {
    public static void main(String[] arg){
        Scanner  sc = new Scanner(System. in);
        int a = -6;
        int b = 5;
        int c = -6;
        int d = 3;
        int count =  0;
        int arr[]= {a,b,c,d};
        for(int i = 0; i<arr.length; i++){
          if(arr[i]<0){
             count+=arr[i];
          }

        }
        System.out.println(count);
    }
}
