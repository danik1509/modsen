public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5, 3, -3, -7, 2, -8, -2, 5};
        int result = maxSubarray(nums);
        System.out.println("Max Sum: " + result);
    }

    public static int maxSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
