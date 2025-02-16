public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
    public static boolean isValid(String s) {
        int roundBrackets = 0;
        int squareBrackets = 0;
        int curlyBrackets = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                roundBrackets++;
            } else if (c == ')') {
                roundBrackets--;
            } else if (c == '[') {
                squareBrackets++;
            } else if (c == ']') {
                squareBrackets--;
            } else if (c == '{') {
                curlyBrackets++;
            } else if (c == '}') {
                curlyBrackets--;
            }
            if (roundBrackets < 0 || squareBrackets < 0 || curlyBrackets < 0) {
                return false;
            }
        }
        return roundBrackets == 0 && squareBrackets == 0 && curlyBrackets == 0;
    }
}