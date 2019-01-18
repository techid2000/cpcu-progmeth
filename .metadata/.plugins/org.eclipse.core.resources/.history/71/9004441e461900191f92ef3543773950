import static java.lang.System.out;
import java.util.Scanner;
public class RockPaperScissors {
	static Scanner sc = new Scanner(System.in);
	static final int[][] eva = {{0,-1,1},{1,0,-1},{-1,1,0}};
	static int convert(char c) {
		if(c == 'R') return 0;
		if(c == 'P') return 1;
		if(c == 'S') return 2;
		return -1;
	}
	static void err() { out.println("Illegal move, please re-run the program"); }
	public static void main(String[] args) {
		while(true) {
			out.println("What is your move?");
			int y = convert(sc.next().charAt(0));
			if(y == -1) {
				err();
				continue;
			}
			out.println("What is the opponent's move");
			int o = convert(sc.next().charAt(0));
			if(o == -1) {
				err();
				continue;
			}
			if(eva[y][o]==1) out.println("Player wins.");
			else if(eva[y][o]==0) out.println("Draw.");
			else if(eva[y][0]==-1) out.println("Opponent wins.");
			break;
		}
	}
}
