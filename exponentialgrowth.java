import java.util.*;
public class exponentialgrowth {
public static double EstimatedCases(double initialcases,double growthrate) {
	double months = (2015-2014)*12-2;
	double estimatedc = initialcases * Math.pow(1+growthrate,months);
	return estimatedc;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial number of Ebola cases: ");
        double initialCases = input.nextDouble();

        System.out.print("Enter the growth rate of Ebola cases: ");
        double growthRate = input.nextDouble();

        System.out.printf("The estimated number of Ebola cases by February 2015 is "+ EstimatedCases(initialCases,growthRate));
    }
}