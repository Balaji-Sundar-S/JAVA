package practice_programs;

import java.util.*;
public class Eighteen_MultiplyBinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String b1, b2;
		int d1, d2;
		System.out.println("Enter first binary number : ");
		b1 = sc.next();
		System.out.println("Enter second binary number : ");
		b2 = sc.next();
		d1 = Integer.parseInt(b1, 2);
		d2 = Integer.parseInt(b2, 2);
		System.out.println("Multiplied value : " +(Integer.toBinaryString(d1 * d2)));
	}
}
