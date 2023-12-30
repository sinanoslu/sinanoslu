import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = sc.nextInt();
		for (int i=0;i<=number;i++) {
			for (int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		if(i==number) {
			for(int m=number-1;m>0;m--) {
				for(int j=0;j<m;j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		}
		}
}