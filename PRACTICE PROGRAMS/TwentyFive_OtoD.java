package practice_programs;

import java.util.Scanner;

public class TwentyFive_OtoD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an octal number");
		int o = Integer.parseInt(sc.nextLine(), 8);
		System.out.println("Decimal value is : " +(Integer.toString(o)));
	}
}
