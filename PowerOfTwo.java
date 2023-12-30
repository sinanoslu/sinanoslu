import java.util.*;
public class PowerOfTwo {
	public static boolean isPowerOfTwo(int a) {
		for(int i=0;i<a;i++) {
		if(Math.pow(2,i)==a) {
			System.out.println("Explanation: "+i+"th power of 2 is "+a+".");
			return true;
		}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the number: ");
			int number = sc.nextInt();
			System.out.println(isPowerOfTwo(number));
		}

	}

}
