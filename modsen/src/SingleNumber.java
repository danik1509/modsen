public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int result = findSingleNumber(nums);
        System.out.println("Have single number: " + result);
    }
    public static int findSingleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}