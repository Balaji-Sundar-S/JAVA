import java.util.*;
public class Three_Divide {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, div;
		System.out.println("input 2 numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		div = a / b;
		System.out.println("division value of " +a+ " and " +b+ " is " +div);
	}
}
