package practice_programs;

import java.util.Scanner;
public class Twenty_DtoH {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter an integer value : ");
		int dec = sc.nextInt();
		System.out.print("hexadecimal value is : " +(Integer.toHexString(dec)));
	}
}
