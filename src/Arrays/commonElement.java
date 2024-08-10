package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonElement {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8};
        common(arr1,arr2);
    }
    public static void common(int arr1[] , int arr2[]){
        List<Integer>list  = Arrays.stream(arr1).filter(number->Arrays.stream(arr2).
                anyMatch(array2->array2==number)).boxed().collect(Collectors.toList());
        System.out.println(list);
    }

}
