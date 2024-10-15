package puzz.patterns;

public class ArrayElementPattern1 {
    public static void main(String [] agrs){
        int arr [] = {-3,2,-2,4,5};
        pat(arr);

    }
    public static void pat(int arr[]){
        int n = arr.length;
        int max = 0;
        for(int i = 0;i<n; i++){
            max = Math.max(max,arr[i]);
        }
        int min = 0;
        for(int i = 0; i<n; i++){
            min = Math.min(min,arr[i]);
        }
        int min1 = Math.abs(min);

        int total = min1+max;

        for(int i = 0; i<total; i++){
            for(int j = 0; j<n; j++){
               if(arr[j]<max){
                    System.out.print(" ");
                    max--;
                }
               else if(max==0){
                   if(max==0){
                       max=min;
                   }
                   else {
                       while (max != 0) {
                           if (arr[i] > max) {
                               System.out.print("*");
                               max++;
                           } else {
                               System.out.print(" ");
                               max++;
                           }
                       }
                   }
               }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
