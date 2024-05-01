package puzz;

import java.util.Scanner;

public class headCut {
    public static int findLastPerson(int n) {
        int lastPerson = 0;
        // In every iteration, we eliminate every second person.
        // So, the last person standing
        for (int i = 2; i <= n; i++) {
            lastPerson = (lastPerson + 2) % i;
        }
        return lastPerson + 1; // Adding 1 to convert 0-based indexing to 1-based indexing
    }
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of people in the circle
        int lastPerson = findLastPerson(n);
        System.out.print("The last person alive is at position: " + lastPerson);
    }
}
