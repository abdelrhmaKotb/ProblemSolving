import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public static void main(String[] args) {
        // String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        // String[] tokens = new String[] { "4", "13", "5", "/", "+" };
        String[] tokens = new String[] { "10","6","9","3","+","-11","*","/","*","17","+","5","+" };
        int result = evalRPN(tokens);
        System.out.println(result);
    }

    public static int evalRPN(String[] tokens) {

        // Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);
                stack.push(number);
            } catch (Exception e) {
                int second = stack.pop();
                int first = stack.pop();
                int res = doOper(first, second, token);
                stack.push(res);
            }
        }

        return stack.pop();
    }

    public static int doOper(int first, int second, String oberation) {
        switch (oberation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            default:
                return 0;
        }
    }
}