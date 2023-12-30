import java.util.*;
public class SwapDigits {
public static int SwapDigits(int number) {
	int temp1 = number;
	int lastdigit=number%10;
	String numberlength = String.valueOf(number);
	for(int i=numberlength.length() ; i>1;i--) {
		number/=10;
	}
	int temp=temp1/10;
	temp = temp*10+number;
	temp= temp-number*(int)Math.pow(10, numberlength.length()-1)+lastdigit*(int)Math.pow(10, numberlength.length()-1);
	return temp;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		System.out.println("Number with swapped digits are: "+SwapDigits(number));
	}
}