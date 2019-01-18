
public class CountEven {
	public static int countEven(int [] a) {
		int i,len=a.length,cnt=0;
		for(i=0; i<len; i++) {
			if(a[i]%2==0)cnt++;
		}
		return cnt;
	}
}
