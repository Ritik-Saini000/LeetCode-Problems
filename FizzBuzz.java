import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	 public static List<String> fizzBuzz(int n) {
		 List<String> str=new ArrayList<String>();
		 for(int i=1;i<=n;i++) {
			 if(i%3==0 && i%5==0)
				 str.add("FizzBuzz");
			 else if(i%3==0)
				 str.add("Fizz");
			 else if(i%5==0)
				 str.add("Buzz");
			 else
				 str.add(Integer.toString(i));
		 }
		 return str;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=15;
		System.out.println(fizzBuzz(n));
	}

}
