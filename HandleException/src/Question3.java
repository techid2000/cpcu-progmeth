
public class Question3 {

	public static void main(String[] args) {
		try {
			int[] a = new int[100];
			for (int i = 0; i <= a.length; i++) {
				if(i >= a.length) {
					throw new MyArrayException("My Array index is out of bounds.");
				}
				a[i] = i;
			}
		} catch(MyArrayException e) {
			e.printStackTrace();
		}
	}
	
}
