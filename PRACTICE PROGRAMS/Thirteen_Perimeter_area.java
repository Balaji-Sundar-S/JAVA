package practice_programs;

import java.util.*;
public class Thirteen_Perimeter_area {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double l, b, area, peri;
		System.out.println("enter length and breadth of rectangle : ");
		l = sc.nextDouble();
		b = sc.nextDouble();
		
		area = l * b;
		peri = 2 * (l + b);
		
		System.out.println("area of circle : " +area);
		System.out.println("perimeter of circle : " +peri);
	}

}
