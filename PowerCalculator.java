import java.util.*;
public class PowerCalculator {
	public static double Power(double a,int b) {
		if(b<0 && a==0 || b==0 && a==0)  {
			System.out.println(""+b+"th power of "+a+" is undefined.");
		}
		if(b<0 && a!=0) {
			System.out.println(""+b+"th power of "+a+" is "+Math.pow(a, b)+".");
		}
		if(a<100 && a>-100 && a!=0 || b>0) {
		return Math.pow(a,b);
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the number: ");
			double number = sc.nextDouble();
			System.out.println("Enter the power: ");
			int power = sc.nextInt();
			System.out.println(Power(number,power));
		}


	}

}
