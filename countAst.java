
public class countAst {

	static int countAst(String str) {
		int ast=0;
		int pipe=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='|')
				pipe++;
			else if(pipe%2==0 && str.charAt(i)=='*')
				ast++;
		}
		return ast;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="yo|uar|e**|b|e***au|tifu|l";
		System.out.println(countAst(str));
	}

}
