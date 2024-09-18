package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		System.out.println("Hey what should our max be?");
		Scanner in = new Scanner (System.in);
		int max = in.nextInt();
		boolean[] prime = new boolean[max];
		
		for (int i=0; i<prime.length; i++) {
			prime[i]=true;
		}
			
			
		for (int i = 2; i<prime.length; i++) {
			for (int j = i*2; j<prime.length; j=j+i) {
					prime[j]=false;

			}
		}
		for (int i=0; i<prime.length; i++) {
			System.out.println("Value: " + prime[i] + " " + (i+2));
		}
	}

}
