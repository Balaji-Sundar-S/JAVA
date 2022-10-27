package practice_programs;

import java.util.*;
import java.lang.Math.*;
public class Eleven_Area_Perimeter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double r, area, peri;
		System.out.println("enter radius of the circle : ");
		r = sc.nextDouble();
		
		area = Math.PI * r * r;
		peri = 2 * Math.PI * r;
		
		System.out.println("area of circle : " +area);
		System.out.println("perimeter of circle : " +peri);
	}
}