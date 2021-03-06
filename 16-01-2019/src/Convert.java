import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class Convert {
	static final int N = 5000007;
	static String[] hash = new String[N];
	static String[] sure = new String[N];
	static int encrypt(String s) {
		int num=0, i=1;
		for(char c:s.toCharArray()) {
			num += i*(int)c;
			i*=17;
			i = ((i%N)+N)%N;
			num = ((num%N)+N)%N;
		}
		i = 1;
		while(sure[num]!=null && !sure[num].equals(s)) {
			num += i;
			i <<= 1;
			i = ((i%N)+N)%N;
			num = ((num%N)+N)%N;
		}
		if(sure[num]==null) sure[num]=s;
		return num;
	}
	
	public static String[] convert(String[] s) throws FileNotFoundException {
		hash = new String[N];
		sure = new String[N];
		int i = 0, len = s.length;
		String[] ret = new String[len];
		Scanner fileScanner = new Scanner(new File("src/mapping.txt"));
		while (fileScanner.hasNext()) {
			Scanner line = new Scanner(fileScanner.nextLine());
			line.useDelimiter(",");
			String data1 = line.next().trim();
			String data2 = line.next().trim();
			hash[encrypt(data1)]=data2; hash[encrypt(data2)]=data1;
		}
		for(i = 0; i < len; i++) {
			String fetch = hash[encrypt(s[i])];
			if(fetch == null) ret[i] = "No match";
			else ret[i] = fetch;
		}
		return ret;
	}
}
