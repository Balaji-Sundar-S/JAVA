package practice_programs;

import java.util.*;

public class ThirtyThree_SumofDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int a, sum = 0, r, b;
		System.out.println("Enter an integer : ");
		a = sc.nextInt();
		b = a;
		
		while (b > 0) {
			r = b % 10;
			sum += r;
			b /= 10;
		}
		System.out.println("sum of digits of " +a+ " is " +sum);
	}
}
