package practice_programs;

import java.util.*;
public class ThirtyFive_PolygonArea {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int n;
		double s;
		System.out.println("Enter number of sides of polygon : ");
		n = sc.nextInt();
		System.out.println("Enter length of side : ");
		s = sc.nextInt();
		System.out.println("Area of polygon : " +((n * Math.pow(s, 2))/(4 * Math.tan(Math.PI/n))));
	}
}
