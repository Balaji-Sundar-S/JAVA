package practice_programs;

import java.util.Scanner;

public class TwentySix_OtoB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an octal number");
		int o = Integer.parseInt(sc.nextLine(), 8);
		System.out.println("Binary value is : " +(Integer.toBinaryString(o)));
	}
}
