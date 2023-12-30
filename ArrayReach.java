import java.util.*;
public class ArrayReach {
    public static boolean canReachTarget(int[] nums, int start, int target, boolean[] visited) {
        if (start < 0 || start >= nums.length || visited[start]) {
            return false;
        }
        if (nums[start] == target) {
            return true; 
        }
        visited[start] = true;
        int move = nums[start];
        return canReachTarget(nums, start + move, target, visited) || canReachTarget(nums, start - move, target, visited);
    }

    public static boolean canReach(int[] nums, int start, int target) {
        boolean[] visited = new boolean[nums.length];
        return canReachTarget(nums, start, target, visited);
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 3, 0, 3, 1, 2}; 
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the starting index: ");
        int startIdx = sc.nextInt(); 
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        if (canReach(array, startIdx, target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        }
    }
}

