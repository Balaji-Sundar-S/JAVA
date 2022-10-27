package practice_programs;

import java.util.Scanner;
public class ThirtyTwo_compare {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int a, b;
		System.out.println("enter first number : ");
		a = sc.nextInt();
		System.out.println("enter second number : ");
		b = sc.nextInt();
		System.out.println((a != b) ? +a+ " != " +b : +a+ " = " +b);
		System.out.println((a < b) ? +a+ " < " +b : +a+ " > " +b);
		System.out.println((a <= b) ? +a+ " <= " +b : +a+ " >= " +b);
	}
}
