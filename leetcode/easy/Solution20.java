import java.util.Stack;

class Solution20 {
    public static void main(String[] args) {
        System.out.println(isValid("()()(){}}"));
    }

    public static boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                switch (c) {

                    case ')':
                        if (stack.empty() || '(' != stack.pop()) {
                            return false;
                        }
                        break;
                    case ']':

                        if (stack.empty() || '[' != stack.pop()) {
                            return false;
                        }
                        break;
                    case '}':

                        if (stack.empty() || '{' != stack.pop()) {
                            return false;
                        }
                        break;
                    default:
                        stack.push(c);
                        break;

                }
            }
            return stack.empty();
    }

}