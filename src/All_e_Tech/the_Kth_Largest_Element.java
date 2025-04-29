package All_e_Tech;
import java.util.Arrays;
import java.util.Scanner;
public class the_Kth_Largest_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(var i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans1 = getKthLargeElement(arr,k);
        System.out.println(ans1);
    }
    public static int getKthLargeElement(int arr[], int k){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
        int endLoop= n-k;
       for(int i = arr.length-1;i>=endLoop;i--){
           ans = arr[i];
       }
        return ans;
    }
}
