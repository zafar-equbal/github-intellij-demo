package PatternDSA.TwoPointer;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60};
        int target = 1000;
        System.out.println(twoSum(arr, target));

    }

    public static boolean twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return false;
    }
}
