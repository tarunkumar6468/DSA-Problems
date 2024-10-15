package puzz;

import java.util.Scanner;

public class FahreheitToCelsius {
    public static void main(String[] args){
        float temp;
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter:");
        temp = sc.nextInt();
        temp = ((temp-32)*5)/9;
        System.out.println("temp : "+temp);
    }
}
