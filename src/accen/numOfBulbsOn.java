package accen;

public class numOfBulbsOn {
    public static void main(String[] args){
        int n = 4;
        int arr[] = {0,1,0,1};
        int count = 0;
        int expect = 1;
        for(int i = 0;i<arr.length;i++){
               if(arr[i]!=expect){
                   count++;
                   expect  = 1-expect;
                   }
        }
        System.out.println(count);

    }
}
