
public class ChangeChar {
	static String changeChar(String s, char c1, char c2) {
		int len = s.length(),i;
		char[] c = s.toCharArray();
		for(i=0; i<len; i++) {
			c[i]=(c[i]==c1 ? c2 : c[i]);
		}
		return String.valueOf(c);
	}
	public static void main(String[] args) {
		System.out.println(changeChar("a hobbit in a hole",'h','b'));
		System.out.println(changeChar("a link to the past",'t','s'));
		System.out.println(changeChar("abcde",'f','d'));
	}
}
