import java.util.*;
public class OrderCities {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first city: ");
		String firstcity = sc.nextLine();
		System.out.println("Please enter second city: ");
		String secondcity = sc.nextLine();
		System.out.println("Please enter third city: ");
		String thirdcity = sc.nextLine();
		if(firstcity.compareTo(secondcity)<0 && secondcity.compareTo(thirdcity)<0) {
			System.out.println("Order of cities: "+firstcity+" "+secondcity+" "+thirdcity);
		}else if (firstcity.compareTo(secondcity)>0 && secondcity.compareTo(thirdcity)<0) {
			System.out.println("Order of cities: "+secondcity+" "+firstcity+" "+thirdcity);
		}else if (firstcity.compareTo(secondcity)<0 && secondcity.compareTo(thirdcity)>0) {
			System.out.println("Order of cities: "+firstcity+" "+thirdcity+" "+secondcity);
		}
		else if(firstcity.compareTo(secondcity)>0 && secondcity.compareTo(thirdcity)>0) {
			System.out.println("Order of cities: "+thirdcity+" "+secondcity+" "+firstcity);
		}else {
			System.out.println("Order of cities: "+thirdcity+" "+firstcity+" "+secondcity);
		}
	}
}
