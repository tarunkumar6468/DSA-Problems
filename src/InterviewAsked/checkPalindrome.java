package InterviewAsked;

public class checkPalindrome {
    public static void main(String[] args){
        String s = "racecar";

        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reverse));

        System.out.println(is_Palindrome_not(s));

    }
    public static boolean is_Palindrome_not(String s){
        int n = s.length();
        char [] a = s.toCharArray();
        int i = 0;
        int j = a.length-1;
        boolean f = true;
        while (i<j){
            if(a[i]==a[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return f;
    }
}
