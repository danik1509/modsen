public class LongestValidParentheses {
    public static void main(String[] args) {
        String s1 = "(()";
        String s2 = ")()())";
        System.out.println(longestValidParentheses(s1));
        System.out.println(longestValidParentheses(s2));
    }

    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }
        return maxLength;
    }
}