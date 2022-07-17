
public class reverseOnlyLetters {

	static String reverseOnlyLetters(String s) {
		char arr[]=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			while(i<j) {
				if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
					break;
				i++;
			}
			while(i<j) {
				if((arr[j]>='a' && arr[j]<='z') || (arr[j]>='A' && arr[j]<='Z'))
					break;
				j--;
			}
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(s));
	}

}
