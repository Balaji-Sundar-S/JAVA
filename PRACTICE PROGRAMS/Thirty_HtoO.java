package practice_programs;

import java.util.Scanner;

public class Thirty_HtoO {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Hexadecimal number");
		int o = Integer.parseInt(sc.nextLine(), 16);
		System.out.println("Octal value is : " +(Integer.toOctalString(o)));
	}
}
