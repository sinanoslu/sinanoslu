import java.util.*;

public class GridCalc {
    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1; 
        } else {
            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    	System.out.println("Enter the rows: ");
        int rows = sc.nextInt(); 
        System.out.println("Enter the columns: ");
        int cols = sc.nextInt();
        System.out.println("Number of ways to reach the end point: " + uniquePaths(rows, cols));
    	}
    }
}