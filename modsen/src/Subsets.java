public class Subsets {
    public static void main(String[] args) {
        int[] nums = {8, 10, 17, 2};
        int[][] result = subsets(nums);
        System.out.println("Subsets:");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    public static int[][] subsets(int[] nums) {
        int totalSubsets = 1 << nums.length;
        int[][] result = new int[totalSubsets][];

        for (int i = 0; i < totalSubsets; i++) {
            result[i] = new int[Integer.bitCount(i)];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) > 0) {
                    result[i][index++] = nums[j];
                }
            }
        }
        return result;
    }
}