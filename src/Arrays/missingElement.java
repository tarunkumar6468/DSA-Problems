package Arrays;

import java.util.Scanner;

public class missingElement {
    public static void main(String[] args){

        int []arr={1,2,3,4,5,6,7,9};
        int ans = findMissingElement(arr);
        System.out.println(ans);

        int ans1 = secondMethod(arr);
        System.out.println(ans1);
    }
    public static int findMissingElement(int[] arr){
        int n = arr.length+1;
        int sum  = 0;
        for(int i = 0; i<n-1; i++){
            sum+=arr[i];
        }
        int expected = (n*(n+1))/2;
        int ans  = expected-sum;
        return ans;
    }


    public static int secondMethod(int []arr) {
        int n = arr.length+1;
    int []hash = new int[n+1];
    for(int i = 0; i<n-1; i++){
        hash[arr[i]]++;
    }
    for(int i =1 ; i<=n-1; i++){
        if(hash[i]==0){
            return i;
        }

    }
return -1;
    }
}

