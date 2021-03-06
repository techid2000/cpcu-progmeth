import static java.lang.System.out;
import java.util.Scanner;
import java.math.*;
public class Flowchart {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.println("Please enter x.");
		int x = sc.nextInt();
		if(x < 0) {
			out.println("Error: "+x);
		} else {
			double lower = 0, upper = x;
			double z = (lower + upper) / 2;
			int i = 0;
			while(Math.abs(z*z - x) > 1e-5) {
				++i;
				z = (lower + upper) / 2;
				if(z*z > x) {
					upper = z;
				} else {
					lower = z;
				}
			}
			out.println(x+" "+z+" "+i);
		}
	}
}
