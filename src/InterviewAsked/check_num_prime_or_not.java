package InterviewAsked;

public class check_num_prime_or_not {
    public static void main(String [] args){
        int n = 34;
        boolean isprime =true;
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
                isprime = false;
            }
        }
        System.out.println(isprime);
    }
}
