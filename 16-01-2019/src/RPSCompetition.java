import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Scanner;
public class RPSCompetition {
	static final int[][] eva = {{0,-1,1},{1,0,-1},{-1,1,0}};
	static int convert(char c) {
		if(c == 'R') return 0;
		if(c == 'P') return 1;
		if(c == 'S') return 2;
		return -1;
	}
	static void err() { out.println("Illegal move, please re-run the program"); }
	public static void main(String[] args) {
		try {
			Scanner sc1, sc2;
			sc1 = new Scanner(new File("player1.txt"));
			sc2 = new Scanner(new File("player2.txt"));
			while(sc1.hasNext()) {
				int y = convert(sc1.nextLine().charAt(0));
				int o = convert(sc2.nextLine().charAt(0));
				if(y == -1 || o == -1) {
					err();
					continue;
				}
				if(eva[y][o]==1) out.println("Player wins.");
				else if(eva[y][o]==0) out.println("Draw.");
				else if(eva[y][0]==-1) out.println("Opponent wins.");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
