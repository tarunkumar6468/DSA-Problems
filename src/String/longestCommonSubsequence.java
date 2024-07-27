package String;

import java.util.Scanner;

public class longestCommonSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];
        for(int i = 0;i<n; i++){
            str[i] = sc.nextLine();
        }
        String ans = commonPrefix(str);
        System.out.println(ans);


    }
    public static String commonPrefix(String[]str){
        int n = str.length;
        if(str.length == 0||str==null)return "";
        String prefix  = str[0];
        for(int i = 1;i<str.length; i++){
            while(str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);

            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }

}
