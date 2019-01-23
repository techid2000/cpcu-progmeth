import java.util.HashMap;
import java.util.Map;

public class Card {
	public enum CardType {
		Creature, Spell, Land;
	}
	public enum ColorType {
		White,Blue,Black,Red,Green,Multicolor,Colorless,Land;
	}
	private static final Map<String,CardType> typeOrder = new HashMap<String,CardType>();
	static {
		typeOrder.put("Artifact Creature", CardType.Creature);
		typeOrder.put("Creature", CardType.Creature);
		typeOrder.put("Legendary Creature", CardType.Creature);
		typeOrder.put("Sorcery", CardType.Spell);
		typeOrder.put("Instant", CardType.Spell);
		typeOrder.put("Artifact", CardType.Spell);
		typeOrder.put("Enchantment", CardType.Spell);
		typeOrder.put("Land", CardType.Land);
	}
	public String cardType; public CardType actualType;
	public String cardName;
	public String cost; public int totalCost; public ColorType actualColor;
	public String text;
	public String power;
	public String toughness;
	public int number;
	public Card(String cardType, String cardName, String cost, String text, String power, String toughness,
			int number) {
		super();
		this.cardType = cardType;
		actualType = typeOrder.get(cardType);
		this.cardName = cardName;
		this.cost = cost;
		char charColor = 'X';
		int ten = 1, color = 0;
		totalCost = 0;
		for(char c : this.cost.toCharArray()) {
			if(c == 'X') continue;
			if(Character.isDigit(c)) {
				totalCost += Character.getNumericValue(c)*ten;
				ten*=10;
			} else {
				charColor = c;
				color++;
				totalCost++;
			}
		}
		if(actualType == CardType.Land) {
			actualColor = ColorType.Land;
		} else {
			if(color == 1) {
				if(charColor == 'W') actualColor = ColorType.White;
				else if(charColor == 'U') actualColor = ColorType.Blue;
				else if(charColor == 'B') actualColor = ColorType.Black;
				else if(charColor == 'R') actualColor = ColorType.Red;
				else if(charColor == 'G') actualColor = ColorType.Green;
			} else if(color == 0) {
				actualColor = ColorType.Colorless;
			} else {
				actualColor = ColorType.Multicolor;
			}
		}
		this.text = text;
		this.power = power;
		this.toughness = toughness;
		this.number = number;
	}
}
