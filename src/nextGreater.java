public class nextGreater {
    public static void main(String[] args){
        int  []arr = {3,5,2,3,10};
        int []yummy = new int[arr.length];
        int i = 0;
        int j = 1;
        while(i<j){
            if(arr[i]<arr[j]){
                arr[i]=arr[j];
                i++;j++;

            }
            else if(arr[i]>arr[j]){
                j++;
            }
            else{
                j++;
            }

        }
        for(int k = 0; k<yummy.length; k++){
            System.out.println(arr);
        }

    }
}
