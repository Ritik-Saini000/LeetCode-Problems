
public class rotateString {

	static boolean rotateString(String A,String B) {
		return A.length()==B.length() && (A+A).contains(B);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A="abcde";
		String B="cdeab";
		System.out.println(rotateString(A,B));
	}

}
