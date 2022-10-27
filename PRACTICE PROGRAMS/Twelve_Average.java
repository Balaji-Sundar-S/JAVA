package practice_programs;

import java.util.*;
public class Twelve_Average {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, sum, avg;
		System.out.println("enter input for a, b & c");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		sum = a + b + c;
		avg = sum / 3;
		
		System.out.println("average of " +a+ ", " +b+ " and " +c+ " is " +avg);
	}

}
