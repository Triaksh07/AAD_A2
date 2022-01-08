package Assignment2.Number;

import java.util.Scanner;
import java.lang.Math;

public class sunnyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (Math.sqrt(n+1)==(int)(Math.sqrt(n+1))){
            System.out.println(n+" is a Sunny Number");
        }
        else{
            System.out.println(n+" is NOT a Sunny Number");
        }
        sc.close();
    }  
}