package String;

public class firstKWords {
    public static void main (String[] args){
        String s = "please provide a good home and good facilities and ";
        int k = 4;
        String ans = getFirst(s,k);
        System.out.println(ans);

    }
    public static String getFirst(String s, int k){
        String[] str = s.split("\\s+");

        if(k>str.length){
            k=str.length;
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<k; i++){
            sb.append(str[i]);
            if(i<k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
