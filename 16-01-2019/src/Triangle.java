import static java.lang.System.out;
import java.util.Scanner;
import java.math.*;
public class Triangle {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.println("Please type value of a.");
		double a = sc.nextDouble();
		out.println("Please type value of b.");
		double b = sc.nextDouble();
		out.println("Please type value of D.");
		double D = sc.nextDouble();
		double C = (Math.PI*D)/180;
		double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(C));
		out.println("The value of c = "+c+" cm.");
	}
}
