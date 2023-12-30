import java.util.*;

public class perfectnumber{
public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

  
    public static boolean[] perfect(int[] arr) {
        boolean[] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = isPerfect(arr[i]);
        }
        return result;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean[] result = perfect(arr);

        for (int i = 0; i < arr.length; i++) {
            if (result[i]) {
                System.out.println(arr[i] + " is a perfect number.");
            } else {
                System.out.println(arr[i] + " is not a perfect number.");
            }
        }
    }
}