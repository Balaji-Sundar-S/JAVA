package practice_programs;

import java.util.Scanner;
public class TwentyTwo_BtoD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number"); 
		int a = Integer.parseInt(sc.nextLine(), 2);
		System.out.println("decimal value is : " +(Integer.toString(a)));
	}
}
