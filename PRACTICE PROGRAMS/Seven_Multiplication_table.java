package practice_programs;

import java.util.Scanner;
public class Seven_Multiplication_table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int i, n = sc.nextInt();
		for (i=1; i<=10; i++) {
			System.out.println(+n+ " x " +i+ " = " +(n*i));
		}
	}

}