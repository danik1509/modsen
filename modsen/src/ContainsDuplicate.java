public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {7, 3, 5, 8, 9, 1, 2, 3};
        boolean result = containsDuplicate(nums);
        System.out.println("Have duplicates: " + result);
    }
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}