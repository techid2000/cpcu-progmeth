import static java.lang.System.out;
import java.util.Scanner;
import java.awt.Point;
public class DistanceOfTwoPoints {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.println("Please enter (x, y).");
		Point p = new Point(sc.nextInt(),sc.nextInt());
		out.println("Please enter (dx, dy).");
		Point d = new Point(sc.nextInt(),sc.nextInt());
		p.translate(d.x, d.y);
		out.println("New point = ("+p.x+", "+p.y+")");
		out.println("Distance = "+p.distance(0,0));
	}
}
