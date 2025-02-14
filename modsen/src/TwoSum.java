public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {10, 3, 18, 5};
        int target = 8;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Sum: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such elements.");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
