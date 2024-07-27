package MathSolutions;

public class number_is_prime_or_not {
    public static void main(String[] args){
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + checkPrime(i));
        }
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) return false;
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
