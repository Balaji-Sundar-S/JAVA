package practice_programs;

import java.util.*;
public class ThirtyFour_HexagonArea {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int s;
		System.out.println("Enter side length of hexagon : ");
		s = sc.nextInt();
		System.out.println("Area of hexagon : " +((6 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/6))));
	}
}