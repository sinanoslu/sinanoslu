import java.util.*;
public class assignmenttwo {
	    public static boolean compare(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        for (int i = 0; i < s1.length();i++) {
	            if (s1.lastIndexOf(s1.charAt(i)) != s2.lastIndexOf(s2.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the first string: ");
		String str1 = sc.next();
		System.out.println("Please enter the second string: ");
		String str2 = sc.next();
		if(compare(str1,str2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}