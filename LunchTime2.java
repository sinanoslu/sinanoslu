import java.util.*;
public class LunchTime2 {
	public static boolean gap(int h1,int m1, int h2,int m2){
		if(Math.abs((h1*60+m1)-(h2*60+m2))>=45 && Math.abs((h1*60+m1)-(h2*60+m2))<=60) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first hour: ");
		int fhour = sc.nextInt();
		System.out.print("Please enter first minute: ");
		int fmin = sc.nextInt();
		System.out.print("Please enter second hour: ");
		int shour = sc.nextInt();
		System.out.print("Please enter second minute: ");
		int smin = sc.nextInt();
		System.out.println("Times entered by user: "+fhour+"."+fmin+"-"+shour+"."+smin);
		if(gap(fhour,fmin,shour,smin)) {
			System.out.print("The gap is enough to eat lunch.");
		}else {
			System.out.print("The gap is not enough to eat lunch.");
		}
	}
}
