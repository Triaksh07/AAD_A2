package Assignment2.Basic;

import java.util.Scanner;
public class primeNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int flag = 0;

		for (int i = 2; i<n; i++){
		    if (n%i==0){
		        flag = 1;  // flag = 1 shows that the number is NOT prime
		        break;
		    }
		}
		if (n==1){
		    System.out.println("1 is neither prime nor composite"); //1 special case
		}
		else{
		    if (flag==1){
		        System.out.println(n+" is NOT a prime number");
		}
		    else{
		        System.out.println(n+" is a prime number");
		}
		}
		sc.close();
	}
}