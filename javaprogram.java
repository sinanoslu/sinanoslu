public class javaprogram {
	public static void main(String[] args) {
		int[] numbers = {5,10,15,20,25};
		System.out.println("Array elements: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Element "+i+": "+numbers[i]);
		}
		numbers[2]=30;
		System.out.println("Altered array elements: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(""+numbers[i]);
		}
	}
}