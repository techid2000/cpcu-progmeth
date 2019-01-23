import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import static java.lang.System.out;
public class Deck {
	ArrayList<Card> cards;
	public void readDeck(String fileName) throws FileNotFoundException {
		cards = new ArrayList<Card>();
		Scanner sc = new Scanner(new File(fileName));
		while(sc.hasNext()) {
			Scanner line = new Scanner(sc.nextLine());
			line.useDelimiter(",");
			cards.add(new Card(line.next().trim(),
					line.next().trim(),
					line.next().trim(),
					line.next().trim(),
					line.next().trim(),
					line.next().trim(),
					Integer.parseInt(line.next().trim())));
		}
	}
	class SortByType implements Comparator<Card> {
		@Override
		public int compare(Card arg0, Card arg1) {
			if(arg0.actualType.ordinal() == arg1.actualType.ordinal()) {
				if(arg0.totalCost == arg1.totalCost) {
					return arg0.cardName.compareTo(arg1.cardName);
				}
				return arg0.totalCost - arg1.totalCost;
			}
			return arg0.actualType.ordinal() - arg1.actualType.ordinal();
		}
	}
	
	class SortByColor implements Comparator<Card> {
		@Override
		public int compare(Card o1, Card o2) {
			if(o1.actualColor == o2.actualColor) {
				if(o1.totalCost == o2.totalCost) {
					return o1.cardName.compareTo(o2.cardName);
				}
				return o1.totalCost - o2.totalCost;
			}
			return o1.actualColor.ordinal() - o2.actualColor.ordinal();
		}
	}
	
	public void printByType() {
		Collections.sort(cards, new SortByType());
		for(Card c : cards) {
			out.println("Number: "+c.number+", Type: "+c.cardType+", Name: "+c.cardName+", Cost: "+c.cost+", Text: "+c.text+", Pow: "+c.power+", Tough: "+c.toughness);
		}
	}
	public void printByColor() {
		Collections.sort(cards, new SortByColor());
		for(Card c : cards) {
			out.println("Number: "+c.number+", Type: "+c.cardType+", Name: "+c.cardName+", Cost: "+c.cost+", Text: "+c.text+", Pow: "+c.power+", Tough: "+c.toughness);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Deck d = new Deck();
		d.readDeck("src/Thopter.txt");
		d.printByType();
		out.println();
		d.printByColor();
	}
}
