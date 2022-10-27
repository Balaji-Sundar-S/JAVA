package practice_programs;

import java.util.Scanner;
public class Fifteen_swap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, temp;
		System.out.println("enter 2 integers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("values before swapping : ");
		System.out.println("a = " +a+ "\tb = " +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("values after swapping : ");
		System.out.println("a = " +a+ "\tb = " +b);
	}
}
