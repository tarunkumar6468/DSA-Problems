package All_e_Tech;
import java.util.Scanner;

public class peek_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findPeek(n,arr);
        System.out.println(ans);
    }
    public static int findPeek (int n ,int arr[]){
        int ans1 = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]>ans1){
                ans1 = arr[i];
            }
        }
        return ans1;
    }
}
