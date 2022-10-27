package practice_programs;

import java.util.Scanner;
public class Six_Arithmetic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("input first number : ");
		a = sc.nextInt();
		System.out.println("input second number : ");
		b = sc.nextInt();
		System.out.println(+a+ " + " +b+ " = " +(a+b));
		System.out.println(+a+ " - " +b+ " = " +(a-b));
		System.out.println(+a+ " x " +b+ " = " +(a*b));
		System.out.println(+a+ " / " +b+ " = " +(a/b));
		System.out.println(+a+ " mod " +b+ " = " +(a%b));
	}

}
