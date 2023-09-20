package studio3;

import java.util.Scanner;

public class Sieve2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int[] sieve = new int [num];
		for (int i = 0; i <= num-1; i++)
		{
			sieve[i]=i+1;
		}
		sieve[0]=0;
		for (int a=0; a<=num-2;a++) {
		if (sieve[a+1]%2==0) {
			sieve[a+1]=0;
		}
		if (sieve[a+1]%3==0) {
			sieve[a+1]=0;
		}
		if (sieve[a+1]%5==0) {
			sieve[a+1]=0;
		}
		if (sieve[a+1]%7==0) {
			sieve[a+1]=0;
		}
		}
		sieve[1]=2;
		sieve[2]=3;
		sieve[4]=5;
		sieve[6]=7;
		for (int i = 0; i <= num-1; i++)
		{
		    if (sieve[i]!=0) {
		    	System.out.print(sieve[i]+" ");
		    }
		}

	}
}