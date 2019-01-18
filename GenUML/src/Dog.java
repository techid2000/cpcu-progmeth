
public class Dog extends Animal{
	int loyalty;
	
	public int getLoyalty() {
		return loyalty;
	}

	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}

	public void speak() {
		System.out.println("Woof");
	}
	
	public void bark() {
		speak();
	}
}
