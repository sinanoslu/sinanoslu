import java.util.*;
public class transposematrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rows and columns: ");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] array = new int[rows][cols];
		System.out.println("Enter matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("The above matrix before Transpose is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println("");
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i==1&&j==0) {
					int temp = array[i][j];
					array[i][j]=array[i-1][j+1];
					array[i-1][j+1]=temp;
				}
				if(i==2&&j==0) {
					int temp = array[i][j];
					array[i][j]=array[i-2][j+2];
					array[i-2][j+2]=temp;
				}
				if(i==2&&j==1) {
					int temp = array[i][j];
					array[i][j]=array[i-1][j+1];
					array[i-1][j+1]=temp;
				}
			}
		}
		System.out.println("The above matrix after Transpose is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println("");
		}
	}
}
