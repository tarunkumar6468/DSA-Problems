package String;

public class removeSpecialCheracter {
    public static void main(String[] agrs){
        String a = "j!@#a%^v}a]";
        a = a.replaceAll("[^a-zA_Z0-9]","");
        System.out.println(a);
    }
}
