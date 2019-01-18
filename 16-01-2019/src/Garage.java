import java.util.ArrayList;

public class Garage {
	public Car[] cars;
	public void removeDup() {
		ArrayList<Car> a = new ArrayList<Car>();
		int len = cars.length;
		for(int i=0; i<len; i++) {
			if(cars[i] == null) continue;
			a.add(cars[i]);
			for(int j=i+1; j<len; j++) {
				if(cars[j]!=null && cars[i].equals(cars[j])) {
					cars[j]=null;
				}
			}
		}
		int s = a.size();
		cars = new Car[s];
		for(int i=0; i<s; i++) {
			cars[i] = a.get(i);
		}
	}
}
