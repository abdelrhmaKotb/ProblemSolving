class Solution {
    public static void main(String[] args) {
        System.out.println(removeStars("abc**"));
    }

    public static String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        int ptr = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                builder.deleteCharAt(ptr--);
            } else {
                builder.append(c);
                ptr++;
            }
        }
        return builder.toString();
    }
}