package accen;

public class LastCharacterMatched {
    public static void main(String[] args){
        String input1 = "thunder";
        String arr[] = {"puzzle","thunder","powder","blender","under"};
        int count = 0;
        for(int i = input1.length()-1; i>0;i--){
            for(int j = 0; i<arr.length; i++){
                String index = arr[i];
                for(int k = index.length()-1; k>0; k++){
                    if(index.charAt(k)==input1.charAt(k)){
                        count++;
                    }
                    else {
                        break;
                    }

                }
            }
        }
        System.out.println(count);
    }
}
