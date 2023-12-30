import java.util.*;

public class arraywithnegativeintegers{
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the length of the array (<=10): ");
	        int length = scanner.nextInt();
	        
	        int[] array = new int[length];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < length; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Initial array: " + Arrays.toString(array));
	        
	        System.out.print("Enter a number to add to the array: ");
	        int number = scanner.nextInt();
	        
	        int index = add(array, number);
	        
	        if (index != -1) {
	            System.out.println("Number added at index " + index);
	        } else {
	            System.out.println("No negative number found in the array.");
	        }
	        
	        System.out.println("Final array: " + Arrays.toString(array));
	        
	        scanner.close();
	    }
	    
	    public static int add(int[] array, int key) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < 0) {
	                array[i] = key;
	                return i;
	            }
	        }
	        
	        return -1;
	    }
}