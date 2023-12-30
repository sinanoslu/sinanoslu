import java.util.*;
public class array {
	public static void main(String[] args) {
		/*String[][] arrays = {{"5","2"},{"7","4"},{"9","8"}};
		boolean[] array2 = {true,false,false,true,true};
		for(int i=0;i<arrays.length;i++) {
			for(int j=0;j<3;j++) {
			arrays[i][j]="sude";
			}
		}

		for(int i=0;i<arrays.length;i++) {
			for(int j=0;j<2;j++) {
			System.out.print(" "+arrays[i][j]);
			}
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int arraylength =  sc.nextInt();
		int[] array;
		for(;;) {
		if(!(arraylength<=10)||arraylength<=0) {
			System.out.println("Invalid number please try again: ");
			arraylength=sc.nextInt();
		}else {
			array = new int[arraylength];
			break;
		}
		}
		for(int i=0;i<arraylength;i++) {
			array[i]=sc.nextInt();
		}
			System.out.print("{");
		for(int i=0;i<arraylength;i++) {
			if(i!=0) {
			System.out.print(","+array[i]);
			}else {
				System.out.print(""+array[i]);
			}
		}
			System.out.print("}");
	}
}