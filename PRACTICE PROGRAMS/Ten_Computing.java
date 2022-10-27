package practice_programs;

import java.util.*;
public class Ten_Computing {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = 1;
		double o = 1, f = 4;
		/*System.out.println("Enter a value : ");
		o = sc.nextDouble();
		System.out.println("Enter a value : ");
		f = sc.nextDouble();*/
		System.out.println(f * (1 - (o/(n*(n+2))) + (o/(n*(n+4))) - (o/(n*(n+6))) + 
				(o/(n*(n+8))) - (o/(n*(n+10)))));
	}
}