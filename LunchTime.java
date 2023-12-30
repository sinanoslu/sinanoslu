import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
public class LunchTime {
	public static boolean gap(int h1,int m1, int h2,int m2) throws ParseException {
		String firsttimestring = h1+":"+m1;
		String secondtimestring = h2+":"+m2;
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
		Date date = (Date)formatter.parse(firsttimestring);
		Date date2 = (Date)formatter.parse(secondtimestring);
		long diff = date2.getTime()-date.getTime();
		if(diff>=45) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) throws ParseException {
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
