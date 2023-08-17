class Solution2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[] { "--X", "X++", "X++" }));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String string : operations) {
            if (string.charAt(1) == '+') {
                res++;
            } else {
                res--;
            }

        }

        return res;
    }

}