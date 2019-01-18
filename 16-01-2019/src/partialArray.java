
public class partialArray {
	public static int[] partialArray(int[] a,int i,int j) {
		if(a==null) return null;
		int cnt = 0, olen = a.length, rlen = olen - (j-i);
		if(i>j || i>=olen || j>olen) return null;
		int[] ret = new int[rlen];
		for(int k = 0; k < olen; k++) {
			if(k >= i && k < j) continue;
			ret[cnt++] = a[k];
		}
		return ret;
	}
}
