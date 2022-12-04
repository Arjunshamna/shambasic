
public class UtilClass {

	public static String reverseString(String s) {
		String rev = "";
		int len = s.length();
		for (int i = len - 1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		return rev;

	}
}

	
			
		
				

