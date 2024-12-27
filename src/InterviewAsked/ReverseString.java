package InterviewAsked;

public class ReverseString {
    public static void main(String[] args){
//        String s = "Tarun";
//        StringBuilder sb  = new StringBuilder();
//        for(int i = s.length()-1; i>=0; i--){
//           sb.append(s.charAt(i));
//        }
//        System.out.println(sb);

//        Integer a = 127;
//        Integer b = 127;
//        System.out.println(a==b); // ture because -128 - 127 to is is on object
//        Integer x = 128;
//        Integer y = 128;

        Integer a  = 128;
        Integer b  = 128; // range it greater than one object so its point to another pointer
        System.out.println(a==b);  // false
    }
}
