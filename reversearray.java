import java.util.*;
public class reversearray {
	public static void reversearray(int number,int[] array) {
		System.out.println("Array after reversing first "+number+" elements:");
		int start=0;
		int sum=0;
		number--;
		while(start<number) {
			int temp = array[start];
			array[start]=array[number];
			array[number]=temp;
			start++;
			number--;
		}
		for(int i =0;i<array.length;i++){
			System.out.print(" "+array[i]);
		}
		for(int i =0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.println("");
		System.out.println("Sum of elements in the array: "+sum);
	}
	public static void main(String[] args) {
		int array[]  = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Original array: ");
		for(int i =0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println("");
		System.out.println("Please enter a number between (1-10): ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(;;) {
		if (0>number||number>10) {
			System.out.println("Please enter a number between (1-10): ");
			number=sc.nextInt();
		}else {
		reversearray(number,array);
		break;
		}
		}
	}
}