import java.util.*;
public class endoftheyearaverage {
	public static int midtermgrade(String number) {
		String midtermgrade = number.substring(0, 2);
		int midtermg = Integer.parseInt(midtermgrade);
		return midtermg;
	}
	public static int finalgrade(String number) {
		String finalgrade = number.substring(2, 4);
		int finalg = Integer.parseInt(finalgrade);
		return finalg;
	}
	public static int quiz1grade(String number) {
		String quiz1grade = number.substring(4, 6);
		int quiz1g = Integer.parseInt(quiz1grade);
		return quiz1g;
	}
	public static int quiz2grade(String number) {
		String quiz2grade = number.substring(6, 8);
		int quiz2g = Integer.parseInt(quiz2grade);
		return quiz2g;
	}
	public static int quiz3grade(String number) {
		String quiz3grade = number.substring(8, 10);
		int quiz3g = Integer.parseInt(quiz3grade);
		return quiz3g;
	}
	public static double grade(double midterm,double quiz1, double finalgrade,double quiz2,double quiz3) {
		return midterm*30/100+finalgrade*55/100+(quiz1+quiz2+quiz3)*5/100;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the student number: ");
		String number = sc.next();
		System.out.println("Midterm : "+midtermgrade(number));
		System.out.println("Final : "+finalgrade(number));
		System.out.println("Quiz_1 : "+quiz1grade(number));
		System.out.println("Quiz_2 : "+quiz2grade(number));
		System.out.println("Quiz_3 : "+quiz3grade(number));
		System.out.println("Your Grade  : "+grade(midtermgrade(number),quiz1grade(number),finalgrade(number),quiz2grade(number),quiz3grade(number)));
	}

}
