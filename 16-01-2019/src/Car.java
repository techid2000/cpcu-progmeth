
public class Car {
	public int serial;
	public String brand;
	
	public Car(int a,String b)
	{
		this.serial=a;
		this.brand =b;
	}
	public boolean equals(Object o) {
		Car ocar = (Car)o;
		return serial==ocar.serial && brand.equals(ocar.brand);
	}
}
