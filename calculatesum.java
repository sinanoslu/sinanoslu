
public class calculatesum {

	public static void main(String[] args) {
		int[][] array = {{5,26,17},{18,35,29},{86,31,56}};
		for(int i=0;i<3;i++) {
			int sumRow=0;
			for(int j=0;j<3;j++) {
			     sumRow += array[i][j];
			}
			System.out.println("Sum of "+(i+1)+". row: "+sumRow);
		}
		for(int i=0;i<3;i++) {
			int sumCol=0;
			for(int j=0;j<3;j++) {
			     sumCol += array[j][i];
			}
			System.out.println("Sum of "+(i+1)+". column: "+sumCol);
		}
	}

}
