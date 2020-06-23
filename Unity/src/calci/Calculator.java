package calci;
import java.util.*;
public class Calculator {
	public static double add(double a, double b) {
		return a+b;
	}
	public static double sub(double a, double b) {
		if(a>b) {
			return a-b;
		}else {
			return b-a;
		}
	}
	public static double mul(double a, double b) {
		return a*b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nubmers");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		System.out.println("Enter choice");
		System.out.println("a for addition");
		System.out.println("s for subtraction");
		System.out.println("m for multiplication");
		String st = sc.next();
		if(st.charAt(0)=='a') {
			System.out.println(add(n1, n2));
		}
		else if(st.charAt(0)=='s') {
			System.out.println(sub(n1, n2));
		}
		else if(st.charAt(0)=='m') {
			System.out.println(mul(n1, n2));
		}
		else {
			System.out.println("Invalid operation");
		}
		return;
	}

}
