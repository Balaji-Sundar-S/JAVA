package practice_programs;

import java.util.*;
public class Nineteen_DtoB {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your integer value : ");
		int dec = sc.nextInt();
		System.out.println("binary value is : " +Integer.toBinaryString(dec));
	}
}
