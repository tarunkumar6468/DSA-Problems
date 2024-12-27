package InterviewAsked;

import java.util.HashMap;

public class Non_rep_char {
    public static void main(String[]args){
        String s ="aaabbbcccdee";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        System.out.println(mp);

        for(char ch : s.toCharArray() ){
            if(mp.get(ch)==1) {
                System.out.print(ch);
            }
        }

    }
}
