
public class ApplyAll {
	static int[] multiplyAll(int x,int[] a,int i) {
		if(i == a.length) return new int[i];
		int[] ret = multiplyAll(x, a, i+1);
		ret[i] = a[i] * x;
		return ret;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = multiplyAll(3,a,0); // position 0 will be multiplied with x first
		for (int x : b) {
			System.out.println(x);
		}
		System.out.println();
		int[] c = {6,8,35,67};
		int[] d = multiplyAll(2,c,0);
		for (int x : d) {
			System.out.println(x);
		}
	}
}
