package Arrays;

import java.util.HashSet;
import java.util.Set;

public class facingLight {
    public static void main(String[] args){
        int height[] = {7, 4, 8, 2 ,9};
        int count = 1;
        int i = 0;
        int j = 1;


        while(j<height.length){
            if(height[i]<height[j]){
                count++;
                i = j;
                j++;
            }

            else{
                j++;
            }
        }


        System.out.println(count);
    }
}
