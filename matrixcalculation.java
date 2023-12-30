public class matrixcalculation { 
	    public static void main(String[] args) {
	        int[][] D = {{1, 5, 2}, {-1, 0, 1}, {3, 2, 4}};
	        int[][] E = {{6, 1, 3}, {-1, 1, 2}, {4, 1 ,3}};
	        int[][] matrix = new int[3][3];
	        matrixtranspose(D);
	        matrixtranspose(E);
	    for(int i=0;i<3;i++) {
	        	for(int j=0;j<3;j++) {
	        		matrix[i][j]=((2*D[i][j])-(3*E[i][j]));
	        	}
	        }
	    matrixtranspose(matrix);
	        for(int i=0;i<3;i++) {
	        	for(int j=0;j<3;j++) {
	        		System.out.print(" "+matrix[i][j]);
	        	}
	        	System.out.println("");
	        }
	        }
	    public static int[][] matrixtranspose(int [][] matrix){
	    	for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==1&&j==0) {
						int temp = matrix[i][j];
						matrix[i][j]=matrix[i-1][j+1];
						matrix[i-1][j+1]=temp;
					}
					if(i==2&&j==0) {
						int temp = matrix[i][j];
						matrix[i][j]=matrix[i-2][j+2];
						matrix[i-2][j+2]=temp;
					}
					if(i==2&&j==1) {
						int temp = matrix[i][j];
						matrix[i][j]=matrix[i-1][j+1];
						matrix[i-1][j+1]=temp;
					}
				}
	    }
			return matrix;
	}
}
