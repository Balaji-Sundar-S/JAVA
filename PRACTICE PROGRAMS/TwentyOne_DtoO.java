package practice_programs;

import java.util.Scanner;
public class TwentyOne_DtoO {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter an integer value : ");
		int dec = sc.nextInt();
		System.out.print("octal value is : " +(Integer.toOctalString(dec)));
	}
}
