import java.util.Scanner;
public class SwapFirstDigit {
public static int SwapDigits(int number) {
	int[] myNumber = {0,0,0};
	String stringnumber = String.valueOf(number);
	for(int i=0;i<stringnumber.length();i++) {
		myNumber[i]=number%10;
		number/=10;
	}
	int temp=myNumber[myNumber.length-1];
	myNumber[myNumber.length-1]=myNumber[0];
	myNumber[0]=temp;
	int res = 0;
	for(int i=myNumber.length-1;i>=0;i--) {
		res = res*10+myNumber[i];
	}
	return res;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a 3 digit number: ");
		int number=sc.nextInt();
		System.out.println("Digits swapped number: "+SwapDigits(number));

	}

}
