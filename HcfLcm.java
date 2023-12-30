import java.util.*;

public class HcfLcm {
public static int hcf(int num1, int num2) {
	int res1 = 1;
	for(int i=2;i<num2;i++) {
		while(num1%i==0&&num2%i==0) {
			num1/=i;
			num2/=i;
			res1*=i;
		}
	}
	return res1;
}
public static int lcm(int num1, int num2) {
	int res=1;
	for(int i=2;i<num2;i++) {
		while(num1%i==0&&num2%i==0) {
			num1/=i;
			num2/=i;
			res*=i;
		}
	}
	for(int j=2;j<=num1;j++) {
		while(num1%j==0) {
			res*=j;
			num1/=j;
		}
	}
	for(int k=2;k<=num2;k++) {
		while(num2%k==0) {
			res*=k;
			num2/=k;
		}
	}
	return res;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("The hcf of two numbers are: "+hcf(num1,num2));
		System.out.println("The lcm of two numbers are: "+lcm(num1,num2));
	}

}
