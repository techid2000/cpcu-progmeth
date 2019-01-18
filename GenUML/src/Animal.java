
public class Animal {
	int age;
    boolean hungry;
	
    public Animal() {
    	this(0,true);
    }
    
    public Animal(int age, boolean hungry) {
		super();
		this.age = age;
		this.hungry = hungry;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	public void speak() {
		System.out.println("No Sound");
	}
    
}
