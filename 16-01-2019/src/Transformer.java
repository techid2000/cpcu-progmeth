
public class Transformer extends Car {
	int hp, attack, defense;
	boolean isRobot;
	public Transformer(int serial, String brand) {
		super(serial, brand);
	}
	
	public Transformer(int a, String b, int hp, int attack, int defense, boolean isRobot) {
		super(a, b);
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.isRobot = isRobot;
	}
	public void punch(Object x) throws StillACarException {
		if(!isRobot) {
			throw new StillACarException("Pen rod yu");
		}
		if(x instanceof Transformer) {
			Transformer y = (Transformer)x;
			y.hp = y.hp - attack;			
		}
	}
	public static void main(String[] args) throws StillACarException {
		Transformer prime = new Transformer(111, "Truck", 5, 2, 1, false);
		Transformer megatron = new Transformer(111, "Mairu", 5, 2, 1, true);
		try {
			prime.punch(megatron);
		} catch(StillACarException e) {
			System.out.println("resetting, please run again.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("dying message!!!");
		}
	}
}

