import java.util.*;
public class DrawRectangle {
	public static void draw_pattern(int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of patterns: ");
		int numberofpatterns = sc.nextInt();
		while(i<=numberofpatterns) {
			System.out.print("row "+i+": ");
			int row2 = sc.nextInt();
			System.out.print("column "+i+": ");
			int col2 = sc.nextInt();
			draw_pattern(row2,col2);
			i++;
		}
	}

}
